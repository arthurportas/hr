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

@Controller(PersonalAreaController.COMPONENT_NAME)
public class PersonalAreaController {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(PersonalAreaController.class);

    public static final String COMPONENT_NAME = "personalAreaController";

    @Qualifier(CompanyMOTDServiceImpl.COMPONENT_NAME)
    @Autowired
    private ICompanyMOTDService motdService;

	@RequestMapping(value = "/personal", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public ModelAndView personal(Model model) {
        slf4jLogger.info("==ModelAndView personal(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("personal");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mav.addObject("username", name);
        if(auth.isAuthenticated() && name!="anonymousUser") {
            mav.addObject("personalArea", "personal");
        }
        mav.addObject("motd", motdService.getById(1L));
		return mav;
	}
	
	@RequestMapping(value = "/personal/announces", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public ModelAndView personalAnnounces(Model model) {
        slf4jLogger.info("==ModelAndView personalAnnounces(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("personal-announces");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mav.addObject("username", name);
        if(auth.isAuthenticated() && name!="anonymousUser") {
            mav.addObject("personalArea", "personal");
        }
        mav.addObject("motd", motdService.getById(1L));
		return mav;
	}
	
	@RequestMapping(value = "/personal/invoices", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public ModelAndView personalInvoices(Model model) {
        slf4jLogger.info("==ModelAndView personalInvoices(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("personal-invoices");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mav.addObject("username", name);
        if(auth.isAuthenticated() && name!="anonymousUser") {
            mav.addObject("personalArea", "personal");
        }
        mav.addObject("motd", motdService.getById(1L));
		return mav;
	}
	
    @RequestMapping(value = "/personal/account", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public ModelAndView personalAccount(Model model) {
        slf4jLogger.info("==ModelAndView personalAccount(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("personal-account");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mav.addObject("username", name);
        if(auth.isAuthenticated() && name!="anonymousUser") {
            mav.addObject("personalArea", "personal");
        }
        mav.addObject("motd", motdService.getById(1L));
		return mav;
	}
	
	@RequestMapping(value = "/personal/mailbox", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public ModelAndView personalMailbox(Model model) {
        slf4jLogger.info("==ModelAndView personalMailbox(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("personal-mailbox");
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
