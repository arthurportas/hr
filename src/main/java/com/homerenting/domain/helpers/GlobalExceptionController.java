package com.homerenting.domain.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Arthur on 13/06/14.
 */
@ControllerAdvice
public class GlobalExceptionController {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(GlobalExceptionController.class);


    @ExceptionHandler(CustomGenericException.class)
    public ModelAndView handleCustomException(CustomGenericException ex) {
        slf4jLogger.info("==ModelAndView handleCustomException(CustomGenericException ex)==");
        slf4jLogger.info(ex.getErrCode());
        slf4jLogger.info(ex.getErrMsg());

        ModelAndView model = new ModelAndView("generic_error");
        model.addObject("errCode", ex.getErrCode());
        model.addObject("errMsg", ex.getErrMsg());
        return model;

    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleAllException(Exception ex) {
        slf4jLogger.info("==ModelAndView handleAllException(Exception ex)==");
        slf4jLogger.info(ex.getMessage());

        ModelAndView model = new ModelAndView("generic_error");
        model.addObject("errMsg", "this is Exception.class");
        return model;
    }
}
