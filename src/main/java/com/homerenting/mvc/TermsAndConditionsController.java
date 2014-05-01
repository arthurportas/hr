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

@Controller(TermsAndConditionsController.COMPONENT_NAME)
public class TermsAndConditionsController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(TermsAndConditionsController.class);

    public static final String COMPONENT_NAME = "termsAndConditionsController";

	@RequestMapping(value = "/terms", method = RequestMethod.GET)
	public ModelAndView terms(Model model) {
        slf4jLogger.info("==ModelAndView terms(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("terms");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mav.addObject("username", name);
		return mav;
	}
}
