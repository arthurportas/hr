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
public class ProfessionalsController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(ProfessionalsController.class);

	@RequestMapping(value = "/professionals", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public ModelAndView professionals(Model model) {
        slf4jLogger.info("==ModelAndView professionals(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("professionals");
		return mav;
	}
}
