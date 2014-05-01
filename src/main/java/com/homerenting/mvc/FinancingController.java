package com.homerenting.mvc;

import com.homerenting.services.CompanyMOTDServiceImpl;
import com.homerenting.services.ICompanyMOTDService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller(FinancingController.COMPONENT_NAME)
public class FinancingController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(FinancingController.class);

    public static final String COMPONENT_NAME = "financingController";

    @Qualifier(CompanyMOTDServiceImpl.COMPONENT_NAME)
    @Autowired
    private ICompanyMOTDService motdService;

	@RequestMapping(value = "/financing", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public ModelAndView financing(Model model) {
        slf4jLogger.info("==ModelAndView financing(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("financing");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mav.addObject("username", name);
        mav.addObject("motd", motdService.getById(1L));
		return mav;
	}
}
