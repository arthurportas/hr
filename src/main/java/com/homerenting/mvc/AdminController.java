package com.homerenting.mvc;

import com.homerenting.domain.Country;
import com.homerenting.domain.UserType;
import com.homerenting.services.IDistrictService;
import com.homerenting.services.IParishService;
import com.homerenting.services.IRegionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller(AdminController.COMPONENT_NAME)
public class AdminController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(AdminController.class);

    public static final String COMPONENT_NAME = "adminController";


    @Qualifier("regionServiceImpl")
    @Autowired
	private IRegionService regionService;

    @Qualifier("parishServiceImpl")
    @Autowired
    private IParishService parishService;

    @Qualifier("districtServiceImpl")
    @Autowired
    private IDistrictService districtService;

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String displayAdminLogin(Model model) {
		return "admin-login";
	}
	@RequestMapping(value = "/admin/home", method = RequestMethod.GET)
	public String displayAdminHome(Model model) {
		return "admin-index";
	}
	
	@RequestMapping(value = "/admin/home/nav/admin-form-new-user", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public ModelAndView displayAdminFormNewUser(Model model) {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin-form-new-user");
        mav.addObject("countries", Country.values());
        mav.addObject("regions", regionService.getAllOrderedByName());
        mav.addObject("localities", districtService.getAllOrderedByName());
        mav.addObject("parishes", parishService.getAllOrderedByName());
        mav.addObject("userTypes", UserType.values());
        return mav;
	}

    @RequestMapping(value = "/admin/home/nav/admin-list-users", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView displayAdminListUsers(Model model) {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin-list-users");
        return mav;
    }
	
/*
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String registerNewUser(@ModelAttribute("newUser") @Valid User newUser,
			BindingResult result, Model model) {
		return NEW_USER_FORM;
		if (!result.hasErrors()) {
			userDao.create(newUser);
			return "redirect:/";	
		} else {
			model.addAttribute("users", userDao.findAllOrderedByName());
			return "index";
		}
	}*/

}
