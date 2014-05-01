package com.homerenting.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(SupportController.COMPONENT_NAME)
public class SupportController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(SupportController.class);

    public static final String COMPONENT_NAME = "supportController";

	@RequestMapping(value = "/support", method = RequestMethod.GET)
	public ModelAndView support(Model model) {
        slf4jLogger.info("==ModelAndView support(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("support");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mav.addObject("username", name);
		return mav;
	}
}
