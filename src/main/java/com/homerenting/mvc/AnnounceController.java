package com.homerenting.mvc;

import com.homerenting.domain.District;
import com.homerenting.domain.Region;
import com.homerenting.domain.helpers.CustomGenericException;
import com.homerenting.domain.modules.header.search.*;
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

import javax.persistence.NoResultException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Controller(AnnounceController.COMPONENT_NAME)
public class AnnounceController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(AnnounceController.class);

    public static final String COMPONENT_NAME = "announceController";

    @Qualifier(CompanyMOTDServiceImpl.COMPONENT_NAME)
    @Autowired
    private ICompanyMOTDService motdService;

    @Qualifier("districtServiceImpl")
    @Autowired
    private IDistrictService districtService;

    @Qualifier("regionServiceImpl")
    @Autowired
    private IRegionService regionService;

    @Qualifier("propertyServiceImpl")
    @Autowired
    private IPropertyService propertyService;

	@RequestMapping(value = "/announces", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public ModelAndView newAnnounce(Model model) {
        slf4jLogger.info("==ModelAndView newAnnounce(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("announce");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mav.addObject("username", name);
        if(auth.isAuthenticated() && name!="anonymousUser") {
            mav.addObject("personalArea", "personal");
        }
        try{
            final List<District> districts = districtService.getAllOrderedByName();
            mav.addObject("districts", districts);
            final Set<Region> regionsPerDistrict = districts.get(0).getRegions();
            mav.addObject("regions", regionsPerDistrict);

            for(Region region : regionsPerDistrict) {
                final Region firstRegionPerDistrict = region;
                mav.addObject("parishes", (firstRegionPerDistrict.getParishes()));
                break;
            }
        } catch (NoResultException nre) {
            slf4jLogger.info("==NoResultException nre==");
            slf4jLogger.info(nre.getMessage());
            throw new CustomGenericException("errorcode", "errormessage");
        }

        mav.addObject("propertyKinds", Arrays.asList(PropertyKind.values()));
        mav.addObject("busynessType", Arrays.asList(BusinessType.values()));
        mav.addObject("propertyStatus", Arrays.asList(PropertyStatus.values()));
        mav.addObject("propertyLocalizationCountry", Arrays.asList(Countries.values()));
        mav.addObject("energyEfficiencyValues", Arrays.asList(EnergyEfficiency.values()));



        mav.addObject("motd", motdService.getById(1L));


		return mav;
	}
}
