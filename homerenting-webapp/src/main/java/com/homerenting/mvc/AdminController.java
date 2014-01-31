package com.homerenting.mvc;

import javax.validation.Valid;

import com.homerenting.domain.User;
import com.homerenting.repo.IUserDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(AdminController.class);
	private static final String NEW_USER_FORM = "newUserForm";
	
	@Autowired
	private IUserDao userDao;

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String displayAdminLogin(Model model) {
		return "admin-login";
	}
	@RequestMapping(value = "/admin/home", method = RequestMethod.GET)
	public String displayAdminHome(Model model) {
		return "admin-index";
	}
	
	@RequestMapping(value = "/admin/home/nav/admin-form-new-user", method = RequestMethod.GET)
	public String displayAdminFormNewUser(Model model) {
		return "admin-form-new-user";
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
