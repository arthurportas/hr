package com.homerenting.mvc;

import com.homerenting.domain.District;
import com.homerenting.domain.modules.header.search.PropertyKind;
import com.homerenting.domain.modules.header.search.PropertyStatus;
import com.homerenting.services.IDistrictService;
import com.homerenting.services.IPropertyService;
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

import java.util.Arrays;
import java.util.List;

@Controller
public class LawController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(LawController.class);

	@RequestMapping(value = "/law/sale", method = RequestMethod.GET)
	public ModelAndView saleTerms(Model model) {
        slf4jLogger.info("==ModelAndView saleTerms(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("saleTerms");
		return mav;
	}

    @RequestMapping(value = "/law/rental", method = RequestMethod.GET)
    public ModelAndView rentalTerms(Model model) {
        slf4jLogger.info("==ModelAndView rentalTerms(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("rentalTerms");
        return mav;
    }
}
