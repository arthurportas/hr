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

@Controller
public class AnnounceController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(AnnounceController.class);

	@RequestMapping(value = "/announces", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public ModelAndView newAnnounce(Model model) {
        slf4jLogger.info("==ModelAndView newAnnounce(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("announce");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mav.addObject("username", name);
		return mav;
	}
}