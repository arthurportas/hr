package com.homerenting.mvc;

import com.homerenting.domain.modules.header.search.PropertyStatus;
import com.homerenting.services.IDistrictService;
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

@Controller
public class RootController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(RootController.class);

    @Qualifier("districtServiceImpl")
    @Autowired
    private IDistrictService districtService;

    @Qualifier("regionServiceImpl")
    @Autowired
    private IRegionService regionService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public ModelAndView index(Model model) {
        slf4jLogger.info("==ModelAndView index(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("districts", districtService.getAllOrderedByName());
        mav.addObject("regions", regionService.getAllOrderedByName());
        mav.addObject("status", Arrays.asList(PropertyStatus.values()));
		return mav;
	}

}
