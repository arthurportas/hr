package com.homerenting.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller(HTTPCodesController.COMPONENT_NAME)
public class HTTPCodesController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(HTTPCodesController.class);

    public static final String COMPONENT_NAME = "httpCodesController";

	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accessDenied(Principal user) {
        slf4jLogger.info("==ModelAndView accessDenied(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("403");
        if (user != null) {
            mav.addObject("msg", "Hi " + user.getName()
                    + ", you do not have permission to access this page!");
        } else {
            mav.addObject("msg",
                    "You do not have permission to access this page!");
        }
        return mav;
	}
}
