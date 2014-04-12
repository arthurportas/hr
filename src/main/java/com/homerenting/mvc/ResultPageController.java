package com.homerenting.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ResultPageController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(ResultPageController.class);

	@RequestMapping(value = "/results", method = RequestMethod.GET)
	public String displayResults    (Model model) {
		return "results";
	}

}
