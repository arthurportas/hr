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

@Controller(ProfessionalsController.COMPONENT_NAME)
public class ProfessionalsController {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(ProfessionalsController.class);

    public static final String COMPONENT_NAME = "professionalsController";

    @Qualifier(CompanyMOTDServiceImpl.COMPONENT_NAME)
    @Autowired
    private ICompanyMOTDService motdService;

	@RequestMapping(value = "/professionals", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public ModelAndView professionals(Model model) {
        slf4jLogger.info("==ModelAndView professionals(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("professionals");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mav.addObject("username", name);
        mav.addObject("motd", motdService.getById(1L));
		return mav;
	}
}
