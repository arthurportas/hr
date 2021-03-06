package com.homerenting.mvc;

import com.homerenting.domain.Property;
import com.homerenting.services.IPropertyService;
import com.homerenting.services.PropertyServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller(APIPropertyController.COMPONENT_NAME)
@RequestMapping("api")
public class APIPropertyController {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(APIPropertyController.class);

    public static final String COMPONENT_NAME = "apiPropertyController";

    @Qualifier(PropertyServiceImpl.COMPONENT_NAME)
    @Autowired
    private IPropertyService propertyService;

    @RequestMapping(value = "properties", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Property> displaySortedProperties(Model model) {
        slf4jLogger.info("==List<Property> displaySortedProperties(Model model)==");
        return propertyService.getAllOrderedByName();
    }

    @RequestMapping("properties/all/{namePattern}")
    @ResponseStatus(HttpStatus.FOUND)
    @ResponseBody
    public List<Property> getAllByNamePattern(@PathVariable String namePattern) {
        slf4jLogger.info("==List<Property> getAllByNamePattern(@PathVariable String namePattern)==");
        return propertyService.getAllByNamePattern(namePattern);
    }

    @RequestMapping("property/one/{name}")
    @ResponseStatus(HttpStatus.FOUND)
    @ResponseBody
    public Property getByName(@PathVariable String name) {
        slf4jLogger.info("==Property getByName(@PathVariable String name)==");
        return propertyService.getByName(name);
    }

    @RequestMapping("property/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    @ResponseBody
    public Property getById(@PathVariable Long id) {
        slf4jLogger.info("==Property getById(@PathVariable Long id)==");
        return propertyService.getById(id);
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
