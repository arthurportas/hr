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


@Controller
public class ResultPageController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(ResultPageController.class);

	@RequestMapping(value = "/results", method = RequestMethod.GET)
	public ModelAndView displayResults (Model model) {
        slf4jLogger.info("==String displayResults (Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("results");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mav.addObject("username", name);
		return mav;
	}

}
