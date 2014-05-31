package com.homerenting.mvc;

import com.homerenting.domain.User;
import com.homerenting.domain.modules.header.login.SecurityQuestions;
import com.homerenting.services.CompanyMOTDServiceImpl;
import com.homerenting.services.ICompanyMOTDService;
import com.homerenting.services.IUserService;
import com.homerenting.services.UserServiceImpl;
import com.homerenting.validators.LoginFormValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.security.Security;

@Controller(LoginController.COMPONENT_NAME)
public class LoginController {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(LoginController.class);

    public static final String COMPONENT_NAME = "loginController";

    @Autowired
    LoginFormValidator loginFormValidator;

    @Qualifier(UserServiceImpl.COMPONENT_NAME)
    @Autowired
    private IUserService userService;

    @Qualifier(CompanyMOTDServiceImpl.COMPONENT_NAME)
    @Autowired
    private ICompanyMOTDService motdService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@ModelAttribute("login") User user,
                              BindingResult result,
                              SessionStatus status,
                              HttpServletRequest request) {
        slf4jLogger.info("==ModelAndView login(@ModelAttribute(\"login\") User user,\n" +
                "                              BindingResult result,\n" +
                "                              SessionStatus status,\n" +
                "                              HttpServletRequest request)==");
        String viewName = "home";

        ModelAndView mav = new ModelAndView(viewName);
        loginFormValidator.validate(user, result);

        if (result.hasErrors()){
            return mav;
        }

        boolean userExists = userService.login(user);

        status.setComplete();

        if(!userExists){
            mav.getModel().put("ERROR", "Invalid UserName and Password");//TODO display friendly errors on frontend
        }else{
            viewName = "index";//TODO redirect to view where use came from
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            String name = auth.getName(); //get logged in username
            mav.addObject("username", name);

            request.getSession().setAttribute("LOGGEDIN_USER", userExists);
        }
        mav.setViewName(viewName);
        mav.addObject("motd", motdService.getById(1L));
        return mav;
    }

    @RequestMapping(value = "/login/new", method = RequestMethod.GET)
    public ModelAndView loginForm() {
        slf4jLogger.info("==ModelAndView loginForm()==");
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("motd", motdService.getById(1L));
        mav.addObject("securityQuestions", SecurityQuestions.values());
        return mav;
    }

    @RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
    public ModelAndView loginError() {
        slf4jLogger.info("==ModelAndView loginError()==");
        ModelAndView mav = new ModelAndView("loginfailed");
        mav.addObject("motd", motdService.getById(1L));
        return mav;
    }

}
