package com.homerenting.mvc;

import com.homerenting.services.CompanyMOTDServiceImpl;
import com.homerenting.services.ICompanyMOTDService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(LawController.COMPONENT_NAME)
public class LawController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(LawController.class);

    public static final String COMPONENT_NAME = "lawController";

    @Qualifier(CompanyMOTDServiceImpl.COMPONENT_NAME)
    @Autowired
    private ICompanyMOTDService motdService;

	@RequestMapping(value = "/law/sale", method = RequestMethod.GET)
	public ModelAndView saleTerms(Model model) {
        slf4jLogger.info("==ModelAndView saleTerms(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("saleTerms");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mav.addObject("username", name);
        if(auth.isAuthenticated() && name!="anonymousUser") {
            mav.addObject("personalArea", "personal");
        }
        mav.addObject("motd", motdService.getById(1L));
		return mav;
	}

    @RequestMapping(value = "/law/rental", method = RequestMethod.GET)
    public ModelAndView rentalTerms(Model model) {
        slf4jLogger.info("==ModelAndView rentalTerms(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("rentalTerms");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mav.addObject("username", name);
        if(auth.isAuthenticated() && name!="anonymousUser") {
            mav.addObject("personalArea", "personal");
        }
        mav.addObject("motd", motdService.getById(1L));
        return mav;
    }
}
