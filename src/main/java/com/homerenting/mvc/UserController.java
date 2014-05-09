package com.homerenting.mvc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import com.homerenting.domain.AccountTokens;
import com.homerenting.domain.User;
import com.homerenting.domain.UserKind;
import com.homerenting.domain.UserShortProfile;
import com.homerenting.domain.helpers.TokenGenerator;
import com.homerenting.repo.IUserDao;
import com.homerenting.repo.UserDaoImpl;
import com.homerenting.services.IUserShortProfileService;
import com.homerenting.services.UserShortProfileServiceImpl;
import com.homerenting.validators.RegisterFormValidator;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.mail.*;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller(UserController.COMPONENT_NAME)
public class UserController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(UserController.class);

    public static final String COMPONENT_NAME = "userController";

    @Autowired
    private ServletContext servletContext;

    @Qualifier(UserDaoImpl.COMPONENT_NAME)
    @Autowired
	private IUserDao userDao;

    @Qualifier(UserShortProfileServiceImpl.COMPONENT_NAME)
    @Autowired
    private IUserShortProfileService userShortProfileService;

    @Autowired
    RegisterFormValidator registerFormValidator;

    @Autowired
    private JavaMailSender mailSender;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String displaySortedMembers(Model model) {
        slf4jLogger.info("==String displaySortedMembers(Model model)==");
		model.addAttribute("newUser", new User());
		model.addAttribute("users", userDao.findAllOrderedByName());
		return "index";
	}

    @RequestMapping(value = "/passwd", method = RequestMethod.GET)
    public String changeUserPassword(Model model) {
        slf4jLogger.info("==String changeUserPassword(Model model)==");
        return "index";
    }

	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String registerNewUser(@ModelAttribute("newUser") @Valid User newUser,
			BindingResult result, Model model) {
        slf4jLogger.info("==String registerNewUser(@ModelAttribute(\"newUser\") @Valid User newUser,\n" +
                "\t\t\tBindingResult result, Model model)==");
		if (!result.hasErrors()) {
		//userDao.create(newUser);
		return "cool";	
	} else {
		//model.addAttribute("users", userDao.findAllOrderedByName());
		return "not so cool";
	}
		//return NEW_USER_FORM;
		/*if (!result.hasErrors()) {
			userDao.create(newUser);
			return "redirect:/";	
		} else {
			model.addAttribute("users", userDao.findAllOrderedByName());
			return "index";
		}*/
	}
	
	@RequestMapping(value = "/userkind", method = RequestMethod.GET)
	@ResponseBody
	public String displayUserKind(Model model) {
		slf4jLogger.info("==String displayUserKind(Model model)==");
		List<String> userKind = new ArrayList<String>(1);
		userKind.add(UserKind.PRIVATE.toString());
		userKind.add(UserKind.CORPORATE.toString());
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = mapper.writeValueAsString(userKind);
			return json;
		} catch (JsonGenerationException jge) {
			slf4jLogger.debug("==JsonGenerationException jge==");
			slf4jLogger.debug(jge.getMessage());
		} catch (JsonMappingException jme) {
			slf4jLogger.debug("==JsonMappingException jme==");
			slf4jLogger.debug(jme.getMessage());
		} catch (IOException ioe) {
			slf4jLogger.debug("==IOException ioe==");
			slf4jLogger.debug(ioe.getMessage());
		}
		return "";
	}

    @RequestMapping(value="/register", method = RequestMethod.PUT,
            headers = {"Content-type=application/json"})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView registerNewUserShortProfile(@RequestBody UserShortProfile newUser,
                                  BindingResult result) {

        slf4jLogger.info("==ModelAndView registerNewUserShortProfile(@RequestBody UserShortProfile newUser,\n" +
                "                               BindingResult result)==");
        String viewName = "user-register-error";

        ModelAndView mav = new ModelAndView(viewName);
        registerFormValidator.validate(newUser, result);

        if (result.hasErrors()){
            mav.addObject("errors", result.getAllErrors());//TODO display friendly errors on frontend
            return mav;
        }

        /*if(userShortProfileService.getByEmail(newUser.getEmail())!=null){
            //user already exists
            //TODO add a nice view for this
            mav.setViewName("user-already-exists");
            return mav;
        }*/
        userShortProfileService.save(newUser);

        String token = TokenGenerator.getUUID();
        AccountTokens accountTokens = new AccountTokens();
        accountTokens.setToken(token);


        newUser.setToken(accountTokens);

        userShortProfileService.update(newUser);

        // creates a simple e-mail object
        SimpleMailMessage email = new SimpleMailMessage();
        email.setFrom("arthurportas@gmail.com");
        email.setTo(newUser.getEmail());

        email.setSubject("subject");

        String msg = StringUtils.EMPTY;

        /*InputStream inputStream = null;
        try {
            inputStream = servletContext.getResourceAsStream("/WEB-INF/templates/user-register-confirmation-email.ftl");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            msg = bufferedReader.readLine();
        }catch (IOException ioe){

        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                }catch (IOException ioe){

                }
            }
        }*/

        email.setText("nice-UUID.randomUUID();" + msg +token);

        // sends the e-mail
        try {
            mailSender.send(email);
            mav.setViewName("user-register-success");
            return mav;
        }catch (MailException me){
            if(me instanceof MailParseException){
                slf4jLogger.info("==MailParseException==");
                slf4jLogger.info(me.getMessage());
            }else if (me instanceof MailAuthenticationException){
                slf4jLogger.info("==MailAuthenticationException==");
                slf4jLogger.info(me.getMessage());
            }else if (me instanceof MailSendException){
                slf4jLogger.info("==MailSendException==");
                slf4jLogger.info(me.getMessage());
            }
        }
        return mav;
    }

    @RequestMapping(value = "/user/{email}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView isEmailAlreadyRegistered(@PathVariable String email) {
        slf4jLogger.info("==ModelAndView isEmailAlreadyRegistered(Model model)==");

        if(userShortProfileService.getByEmail(email)!=null){
            String viewName = "email-already-registered";
            ModelAndView mav = new ModelAndView(viewName);
            return mav;
        }
        String viewName = "email-un-registered";
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
    @RequestMapping(value = "/user/account/activate/{email}/{token}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView activateUserAccount(@PathVariable String email, @PathVariable String token) {
        slf4jLogger.info("==ModelAndView activateUserAccount(@PathVariable String token)==");
        String viewName = "account-activation-error";
        ModelAndView mav = new ModelAndView(viewName);
        final UserShortProfile user = userShortProfileService.getByEmail(email);
        if(userShortProfileService.isAccountActivationTokenValid(user, token)){
            userShortProfileService.activateAccount(user);
            //TODO send email with account activation
            viewName = "account-activation-success";
            mav.setViewName(viewName);
            return mav;
        }
        return mav;
    }
}
