package com.homerenting.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(ContactController.class);

	@RequestMapping(value = "/contacts", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public ModelAndView contact(Model model) {
        slf4jLogger.info("==ModelAndView contact(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("contact");
		return mav;
	}
}
