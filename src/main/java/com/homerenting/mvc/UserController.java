package com.homerenting.mvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.homerenting.domain.User;
import com.homerenting.domain.UserKind;
import com.homerenting.domain.UserShortProfile;
import com.homerenting.domain.modules.header.contacts.EmailContact;
import com.homerenting.repo.IUserDao;
import com.homerenting.repo.UserDaoImpl;
import com.neovisionaries.i18n.CountryCode;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller(UserController.COMPONENT_NAME)
public class UserController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(UserController.class);

    public static final String COMPONENT_NAME = "userController";

    @Qualifier(UserDaoImpl.COMPONENT_NAME)
    @Autowired
	private IUserDao userDao;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String displaySortedMembers(Model model) {
        slf4jLogger.info("==String displaySortedMembers(Model model)==");
		model.addAttribute("newUser", new User());
		model.addAttribute("users", userDao.findAllOrderedByName());
		return "index";
	}

    @RequestMapping(value = "/passwd", method = RequestMethod.GET)
    public String changeUserPassword(Model model) {
        slf4jLogger.info("==String changeUserPassword(Model model)==");
        return "index";
    }

	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String registerNewUser(@ModelAttribute("newUser") @Valid User newUser,
			BindingResult result, Model model) {
        slf4jLogger.info("==String registerNewUser(@ModelAttribute(\"newUser\") @Valid User newUser,\n" +
                "\t\t\tBindingResult result, Model model)==");
		if (!result.hasErrors()) {
		//userDao.create(newUser);
		return "cool";	
	} else {
		//model.addAttribute("users", userDao.findAllOrderedByName());
		return "not so cool";
	}
		//return NEW_USER_FORM;
		/*if (!result.hasErrors()) {
			userDao.create(newUser);
			return "redirect:/";	
		} else {
			model.addAttribute("users", userDao.findAllOrderedByName());
			return "index";
		}*/
	}
	
	@RequestMapping(value = "/userkind", method = RequestMethod.GET)
	@ResponseBody
	public String displayUserKind(Model model) {
		slf4jLogger.info("==String displayUserKind(Model model)==");
		List<String> userKind = new ArrayList<String>(1);
		userKind.add(UserKind.PRIVATE.toString());
		userKind.add(UserKind.CORPORATE.toString());
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = mapper.writeValueAsString(userKind);
			return json;
		} catch (JsonGenerationException jge) {
			slf4jLogger.debug("==JsonGenerationException jge==");
			slf4jLogger.debug(jge.getMessage());
		} catch (JsonMappingException jme) {
			slf4jLogger.debug("==JsonMappingException jme==");
			slf4jLogger.debug(jme.getMessage());
		} catch (IOException ioe) {
			slf4jLogger.debug("==IOException ioe==");
			slf4jLogger.debug(ioe.getMessage());
		}
		return "";
	}

    @RequestMapping(value="/register", method = RequestMethod.PUT,
            headers = {"Content-type=application/json"})
    @ResponseStatus(HttpStatus.OK)
    public String registerNewUserShortProfile(@RequestBody UserShortProfile newUser,
                                  BindingResult result) {


        if (!result.hasErrors()) {
            //userDao.create(newUser);
            return "cool";
        } else {
            //model.addAttribute("users", userDao.findAllOrderedByName());
            return "not so cool";
        }
    }
}
