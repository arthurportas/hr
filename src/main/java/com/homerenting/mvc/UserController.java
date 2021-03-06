package com.homerenting.mvc;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.persistence.NoResultException;
import javax.validation.Valid;

import com.homerenting.domain.AccountTokens;
import com.homerenting.domain.User;
import com.homerenting.domain.UserKind;
import com.homerenting.domain.UserShortProfile;
import com.homerenting.domain.helpers.TokenGenerator;
import com.homerenting.domain.modules.header.navigation.EmailTemplates;
import com.homerenting.domain.modules.header.security.Role;
import com.homerenting.domain.modules.header.security.Roles;
import com.homerenting.repo.IUserDao;
import com.homerenting.repo.UserDaoImpl;
import com.homerenting.services.IMailService;
import com.homerenting.services.IUserShortProfileService;
import com.homerenting.services.MailServiceImpl;
import com.homerenting.services.UserShortProfileServiceImpl;
import com.homerenting.validators.RegisterFormValidator;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller(UserController.COMPONENT_NAME)
public class UserController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(UserController.class);

    public static final String COMPONENT_NAME = "userController";

    //@Value("${base.url}")//TODO: inject property
    private String baseURL = "http://homerenting-afmp.rhcloud.com";

    @Qualifier(UserDaoImpl.COMPONENT_NAME)
    @Autowired
	private IUserDao userDao;

    @Qualifier(UserShortProfileServiceImpl.COMPONENT_NAME)
    @Autowired
    private IUserShortProfileService userShortProfileService;

    @Autowired
    RegisterFormValidator registerFormValidator;

    @Qualifier(MailServiceImpl.COMPONENT_NAME)
    @Autowired
    private IMailService  mailService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String displaySortedMembers(Model model) {
        slf4jLogger.info("==String displaySortedMembers(Model model)==");
		model.addAttribute("newUser", new User());
		model.addAttribute("users", userDao.findAllOrderedByName());
		return "index";
	}

    @RequestMapping(value = "/passwd/{email}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView userChangePasswordRequest(@PathVariable String email) {
        slf4jLogger.info("==String changeUserPassword(@PathVariable String email)==");
        String viewName = "password-change-request-error";//view does not exists
        ModelAndView mav = new ModelAndView(viewName);
        final UserShortProfile user = userShortProfileService.getByEmail(email);
        if(user!=null){
            String token = TokenGenerator.getUUID();
            Map<String,Object> data = new HashMap<String,Object>();
            data.put("user", user.getEmail());
            data.put("portalName", "ImoWeb");
            data.put("passwordChangeURL", baseURL + "/passwd/" + user.getEmail() + "/" + token);
            SimpleDateFormat gmtDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            gmtDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            data.put("timeStamp", gmtDateFormat.format(new Date()));

            mailService.sendUserPasswordChangeRequestMessageWithTemplate("arthurportas@gmail.com", user.getEmail(),
                    "subject", EmailTemplates.PASSWORD_RECOVERY.getValue(), data);
            viewName = "password-change-request-email-sent";//view does not exists
            mav = new ModelAndView(viewName);
            return mav;
        }else{
            viewName = "password-change-email-unknown";//view does not exists
            mav = new ModelAndView(viewName);
            return mav;
        }
    }

    @RequestMapping(value = "/passwd/{email}/{token}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView userChangePasswordRequestWithToken(@PathVariable String email, @PathVariable String token) {
        slf4jLogger.info("==String userChangePasswordRequestWithToken(@PathVariable String email, @PathVariable String token)==");
        String viewName = "password-change-request-token-error";//view does not exists
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
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

        try {
            if(userShortProfileService.getByEmail(newUser.getEmail())!=null){
                //user already exists
                mav.setViewName("user-already-exists");
                return mav;
            }
        } catch(NoResultException nre) {
            slf4jLogger.info("==NoResultException==");
            slf4jLogger.info(nre.getMessage());
        }

        userShortProfileService.save(newUser);

        String token = TokenGenerator.getUUID();
        AccountTokens accountTokens = new AccountTokens();
        accountTokens.setToken(token);

        newUser.setToken(accountTokens);


        Role role = new Role();
        role.setRoleName(Roles.ROLE_USER);//TODO:put this roles as default

        newUser.getRoles().add(role);

        userShortProfileService.update(newUser);

        //TODO: sender email inside property
        //mailService.sendUserRegistrationMessage("arthurportas@gmail.com", newUser.getEmail(), "subject", token);

        Map<String,Object> data = new HashMap<String,Object>();
        data.put("user", newUser.getEmail());
        data.put("portalName", "ImoWeb");
        data.put("activationURL", baseURL + "/user/account/activate/" + newUser.getEmail() + "/" + token);
        mailService.sendUserRegistrationMessageWithTemplate("arthurportas@gmail.com", newUser.getEmail(),
                "subject", EmailTemplates.USER_REGISTER_CONFIRMATION.getValue(), data);

        mav.setViewName("user-register-success");
        return mav;
    }

    @RequestMapping(value = "/user/{email}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView isEmailAlreadyRegistered(@PathVariable String email) {
        slf4jLogger.info("==ModelAndView isEmailAlreadyRegistered(Model model)==");

        try {
            userShortProfileService.getByEmail(email);
            String viewName = "email-already-registered";
            ModelAndView mav = new ModelAndView(viewName);
            return mav;
        } catch(NoResultException nre) {
            slf4jLogger.info("==NoResultException==");
            slf4jLogger.info(nre.getMessage());
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
        UserShortProfile user;
        try {
            user = userShortProfileService.getByEmail(email);
            if(!user.isAccountEnabled()){
                if(userShortProfileService.isAccountActivationTokenValid(user, token)){
                    userShortProfileService.activateAccount(user);
                    Map<String,Object> data = new HashMap<String,Object>();
                    data.put("user", user.getEmail());
                    data.put("portalName", "ImoWeb");
                    mailService.sendUserRegistrationMessageWithTemplate("arthurportas@gmail.com", user.getEmail(),
                            "subject", EmailTemplates.USER_ACCOUNT_ACTIVATION.getValue(), data);

                    viewName = "account-activation-success";
                    mav.setViewName(viewName);
                    return mav;
                }
            }else{
                //account already active
                viewName = "account-already-active";//this view does not exists
                mav.setViewName(viewName);
                return mav;
            }
        } catch(NoResultException nre) {
            slf4jLogger.info("==NoResultException==");
            slf4jLogger.info(nre.getMessage());
        }
        return mav;
    }
}
