package com.homerenting.mvc;

import java.util.List;

import com.homerenting.domain.User;
import com.homerenting.repo.IUserDao;

import com.homerenting.repo.UserDaoImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller(UserRestController.COMPONENT_NAME)
@RequestMapping("/rest/users")
public class UserRestController {


    private static final Logger slf4jLogger = LoggerFactory.getLogger(UserRestController.class);

    public static final String COMPONENT_NAME = "userRestController";

	@Qualifier(UserDaoImpl.COMPONENT_NAME)
    @Autowired
	private IUserDao userDao;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<User> listAllUsers() {
        slf4jLogger.info("==@ResponseBody List<User> listAllUsers()==");
		return userDao.findAllOrderedByName();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody User lookupUserById(@PathVariable("id") Long id) {
        slf4jLogger.info("==@ResponseBody User lookupUserById(@PathVariable(\"id\") Long id)==");
		return userDao.find(id);
	}
}
