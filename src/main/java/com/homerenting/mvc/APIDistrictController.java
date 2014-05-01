package com.homerenting.mvc;

import com.homerenting.domain.District;
import com.homerenting.services.DistrictServiceImpl;
import com.homerenting.services.IDistrictService;
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

@Controller(APIDistrictController.COMPONENT_NAME)
@RequestMapping("api")
public class APIDistrictController {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(APIDistrictController.class);

    public static final String COMPONENT_NAME = "apiDistrictController";

    @Qualifier(DistrictServiceImpl.COMPONENT_NAME)
    @Autowired
    private IDistrictService districtService;

    @RequestMapping(value = "/district", method = RequestMethod.GET)
    @ResponseBody
    public List<District> displaySortedDistricts(Model model) {
        slf4jLogger.info("==List<District> displaySortedDistricts(Model model)==");
        return districtService.getAllOrderedByName();
    }

    @RequestMapping(value= "/district/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.FOUND)
    @ResponseBody
    public District getById(@PathVariable Long id) {
        slf4jLogger.info("==District getById(@PathVariable Long id)==");
        return districtService.getById(id);
    }

    // handles locality form submit
    @RequestMapping(value="/district", method=RequestMethod.POST)
    @ResponseBody
    public String registerNewDistrict(@Valid @ModelAttribute("newDistrict") District newDistrict, BindingResult result, Model model) {
        slf4jLogger.info("==String registerNewDistrict(@Valid @ModelAttribute(\"newDistrict\") District newDistrict, BindingResult result, Model model)==");
        if (!result.hasErrors()) {
            districtService.save(newDistrict);
            return "redirect:/";
        } else {
            model.addAttribute("districts", districtService.getAllOrderedByName());
            return "index";//TODO correct view
        }
    }
}
