package com.homerenting.mvc;

import com.homerenting.domain.District;
import com.homerenting.domain.modules.header.search.BusinessType;
import com.homerenting.domain.modules.header.search.PropertyStatus;
import com.homerenting.domain.modules.header.search.PropertyKind;
import com.homerenting.services.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller(RootController.COMPONENT_NAME)
public class RootController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(RootController.class);

    public static final String COMPONENT_NAME = "rootController";

    @Qualifier("districtServiceImpl")
    @Autowired
    private IDistrictService districtService;

    @Qualifier("regionServiceImpl")
    @Autowired
    private IRegionService regionService;

    @Qualifier("propertyServiceImpl")
    @Autowired
    private IPropertyService propertyService;//should act as a facade dor apartment service villas etc

    @Qualifier(ApartmentServiceImpl.COMPONENT_NAME)
    @Autowired
    private IApartmentService apartmentService;

    @Qualifier(CompanyMOTDServiceImpl.COMPONENT_NAME)
    @Autowired
    private ICompanyMOTDService motdService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public ModelAndView index(Model model) {
        slf4jLogger.info("==ModelAndView index(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        final List<District> districts = districtService.getAllOrderedByName();
        mav.addObject("districts", districts);
        mav.addObject("regions", districts.get(0).getRegions());
        //mav.addObject("regions", regionService.getAllOrderedByName());
        mav.addObject("propertyKinds", Arrays.asList(PropertyKind.values()));
        mav.addObject("status", Arrays.asList(PropertyStatus.values()));
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mav.addObject("username", name);
        if(auth.isAuthenticated() && name!="anonymousUser") {
            mav.addObject("personalArea", "personal");
        }
        mav.addObject("apartments", apartmentService.getHighlitedApartments());//TODO-just for test
        mav.addObject("highlightedProperties", propertyService.getAllHighLighted());

        mav.addObject("motd", motdService.getById(1L));
		return mav;
	}
}
