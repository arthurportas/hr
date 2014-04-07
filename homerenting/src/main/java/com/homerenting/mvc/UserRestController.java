package com.homerenting.mvc;

import java.util.List;

import com.homerenting.domain.User;
import com.homerenting.repo.IUserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest/users")
public class UserRestController {

	@Autowired
	private IUserDao userDao;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody
	List<User> listAllUsers() {
		return userDao.findAllOrderedByName();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody
	User lookupUserById(@PathVariable("id") Long id) {
		return userDao.find(id);
	}
}
