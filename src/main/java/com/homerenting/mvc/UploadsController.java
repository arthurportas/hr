package com.homerenting.mvc;

import com.homerenting.external.CloudinarySingleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller(UploadsController.COMPONENT_NAME)
public class UploadsController {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(UploadsController.class);

    public static final String COMPONENT_NAME = "uploadsController";

    @RequestMapping(value = "/uploads", method = RequestMethod.GET)
    public ModelAndView handleUploads() {
        slf4jLogger.info("==ModelAndView handleUploads()==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("uploads");
        mav.addObject("imageApi", CloudinarySingleton.getCloudinary());
        return mav;
    }
}
