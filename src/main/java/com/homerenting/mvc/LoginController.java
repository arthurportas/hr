package com.homerenting.mvc;

import com.homerenting.domain.User;
import com.homerenting.services.IUserService;
import com.homerenting.services.IUserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    LoginFormValidator loginFormValidator;

    IUserService userService;

    @Autowired
    public LoginController(IUserServiceImpl userService) {
        this.userService = userService;
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("login") User user,
                              BindingResult result,
                              SessionStatus status,
                              HttpServletRequest request) {

        String viewName = "/home";

        ModelAndView mav = new ModelAndView(viewName);
        loginFormValidator.validate(user, result);

        if (result.hasErrors()){
            return mav;
        }

        boolean userExists = userService.login(user);

        status.setComplete();

        if(!userExists){
            mav.getModel().put("ERROR", "Invalid UserName and Password");
        }else{
            viewName = "/home";//TODO redirect to view where use came from
            request.getSession().setAttribute("LOGGEDIN_USER", userExists);
        }
        mav.setViewName(viewName);
        return mav;
    }
}
