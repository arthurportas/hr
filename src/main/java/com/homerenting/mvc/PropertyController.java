package com.homerenting.mvc;

import com.homerenting.domain.Property;
import com.homerenting.domain.modules.header.search.PropertyKind;
import com.homerenting.services.CompanyMOTDServiceImpl;
import com.homerenting.services.ICompanyMOTDService;
import com.homerenting.services.IPropertyService;
import com.homerenting.services.PropertyServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.NoResultException;
import javax.validation.Valid;
import java.util.List;

@Controller(PropertyController.COMPONENT_NAME)
public class PropertyController {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(PropertyController.class);

    public static final String COMPONENT_NAME = "propertyController";

    @Qualifier(PropertyServiceImpl.COMPONENT_NAME)
    @Autowired
    private IPropertyService propertyService;

    @Qualifier(CompanyMOTDServiceImpl.COMPONENT_NAME)
    @Autowired
    private ICompanyMOTDService motdService;

    @RequestMapping(value = "/properties", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Property> displaySortedProperties(Model model) {
        slf4jLogger.info("==List<Property> displaySortedProperties(Model model)==");
        return propertyService.getAllOrderedByName();
    }

    @RequestMapping("/properties/all/highlighted")
    @ResponseStatus(HttpStatus.FOUND)
    @ResponseBody
    public ModelAndView getAllByHighlighted() {
        slf4jLogger.info("==List<Property> getAllByHighlighted()==");
        ModelAndView mav = new ModelAndView();
        String viewName= "properties-all-highlighted";
        try{
            List<Property> properties = propertyService.getAllHighLighted();
            mav.addObject("properties", properties);
            mav.setViewName(viewName);
            return mav;
        } catch (NoResultException nre) {
            slf4jLogger.info("==NoResultException nre==");
            slf4jLogger.info(nre.getMessage());
        }
        return null;//TODO: perhaps a nice view for error handling
    }

    @RequestMapping("/properties/all/{namePattern}")
    @ResponseStatus(HttpStatus.FOUND)
    @ResponseBody
    public List<Property> getAllByNamePattern(@PathVariable String namePattern) {
        slf4jLogger.info("==List<Property> getAllByNamePattern(@PathVariable String namePattern)==");
        return propertyService.getAllByNamePattern(namePattern);
    }

    @RequestMapping(value = "/properties/district/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ModelAndView getNumPropertiesByDistrict(@PathVariable Long id) {
        slf4jLogger.info("== ModelAndView getNumPropertiesByDistrict(@PathVariable Long id)==");
        ModelAndView mav = new ModelAndView();
        String vieName= "num-properties-per-district";
        mav.addObject("numProperties", propertyService.getAllByDistrict(id).size());
        mav.setViewName(vieName);
        return mav;
    }

    @RequestMapping(value = "/properties/region/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ModelAndView getNumPropertiesByRegion(@PathVariable Long id) {
        slf4jLogger.info("==ModelAndView getNumPropertiesByRegion(@PathVariable Long id)==");
        ModelAndView mav = new ModelAndView();
        String vieName= "num-properties-per-region";
        mav.addObject("numProperties", propertyService.getAllByRegion(id).size());
        mav.setViewName(vieName);
        return mav;
    }

    @RequestMapping(value = "/properties/{propertyId}/region/{regionId}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ModelAndView getNumPropertiesDistrictAndByRegion(@PathVariable Long propertyId, @PathVariable Long regionId) {
        slf4jLogger.info("==ModelAndView getNumPropertiesDistrictAndByRegion(@PathVariable Long propertyId, @PathVariable Long regionId)==");
        ModelAndView mav = new ModelAndView();
        String vieName= "num-properties-per-district-region";
        mav.addObject("numProperties", propertyService.getAllByDistrictAndRegion(propertyId, regionId).size());
        mav.setViewName(vieName);
        return mav;
    }

    @RequestMapping(value = "/properties/{propertyId}/region/{regionId}/property-kind/{propertyKind}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ModelAndView getNumPropertiesDistrictRegionAndKind(@PathVariable Long propertyId, @PathVariable Long regionId, @PathVariable String propertyKind) {
        slf4jLogger.info("==ModelAndView getNumPropertiesDistrictRegionAndKind(@PathVariable Long propertyId, @PathVariable Long regionId, @PathVariable String propertyKind)==");
        ModelAndView mav = new ModelAndView();
        String vieName= "num-properties-per-district-region-kind";
        mav.addObject("numProperties", propertyService.getAllByDistrictRegionAndKind(propertyId, regionId, propertyKind).size());
        mav.setViewName(vieName);
        return mav;
    }

    @RequestMapping(value = "/properties/property-kind/{propertyKind}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ModelAndView getNumPropertiesByPropertyKind(@PathVariable String propertyKind) {
        slf4jLogger.info("==ModelAndView getNumPropertiesByPropertyKind(@PathVariable String propertyKind)==");
        ModelAndView mav = new ModelAndView();
        String vieName= "num-properties-per-property-kind";
        mav.addObject("numProperties", propertyService.getAllByPropertyKind(propertyKind).size());
        mav.setViewName(vieName);
        return mav;
    }

    @RequestMapping(value = "/properties/business-kind/{businessKind}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ModelAndView getNumPropertiesByBusinessKind(@PathVariable String businessKind) {
        slf4jLogger.info("==ModelAndView getNumPropertiesByBusinessKind(@PathVariable String businessKind)==");
        ModelAndView mav = new ModelAndView();
        String vieName= "num-properties-per-business-kind";
     //   mav.addObject("numProperties", propertyService.getAllByPropertyKind(businessKind).size());//TODO
        mav.setViewName(vieName);
        return mav;
    }

    @RequestMapping(value = "/property/one/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.FOUND)
    @ResponseBody
    public Property getByName(@PathVariable Long id) {
        slf4jLogger.info("==Property getByName(@PathVariable String id)==");
        return propertyService.getById(id);
    }

    @RequestMapping(value = "/property/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.FOUND)
    @ResponseBody
    public ModelAndView getById(@PathVariable Long id) {
        slf4jLogger.info("==ModelAndView getById(@PathVariable Long id)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("propertyDetail");
        mav.addObject("property", propertyService.getById(id));
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mav.addObject("username", name);
        if(auth.isAuthenticated() && name!="anonymousUser") {
            mav.addObject("personalArea", "personal");
        }
        mav.addObject("motd", motdService.getById(1L));
        return mav;
    }

    // handles property form submit
    @RequestMapping(value="property", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public String registerNewProperty(@Valid @ModelAttribute("newProperty") Property newProperty, BindingResult result, Model model) {
        slf4jLogger.info("==String registerNewProperty(@Valid @ModelAttribute(\"newProperty\") Property newProperty, BindingResult result, Model model)==");
        if (!result.hasErrors()) {
            propertyService.save(newProperty);
            return "redirect:/";
        } else {
            model.addAttribute("properties", propertyService.getAllOrderedByName());
            return "index";//TODO correct view
        }
    }
}
