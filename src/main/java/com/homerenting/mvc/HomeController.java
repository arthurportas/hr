package com.homerenting.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    public HomeController() {
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String displayHome(Model model) {
        slf4jLogger.info("/home");
        slf4jLogger.info("String displayHome(Model model) ");
        return "index";
    }
}
