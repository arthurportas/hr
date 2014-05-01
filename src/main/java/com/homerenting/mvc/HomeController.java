package com.homerenting.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller(HomeController.COMPONENT_NAME)
public class HomeController {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(HomeController.class);

    public static final String COMPONENT_NAME = "homeController";

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String displayHome(Model model) {
        slf4jLogger.info("==String displayHome(Model model)==");
        return "index";
    }
}
