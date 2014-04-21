package com.homerenting.mvc;

import com.homerenting.domain.District;
import com.homerenting.services.IDistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DistrictController {

    private IDistrictService districtService;

    @Autowired
    public DistrictController(IDistrictService districtService) {
        this.districtService = districtService;
    }

    @RequestMapping(value = "/district", method = RequestMethod.GET)
    @ResponseBody
    public List<District> displaySortedDistricts(Model model) {
        return districtService.getAllOrderedByName();
    }

    @RequestMapping(value= "/district/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView getById(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("regions-by-district");
        mav.addObject("regions", districtService.getById(id).getRegions());
        return mav;
    }

    // handles locality form submit
    @RequestMapping(value="/district", method=RequestMethod.POST)
    @ResponseBody
    public String registerNewDistrict(@Valid @ModelAttribute("newDistrict") District newDistrict, BindingResult result, Model model) {
        if (!result.hasErrors()) {
            districtService.save(newDistrict);
            return "redirect:/";
        } else {
            model.addAttribute("districts", districtService.getAllOrderedByName());
            return "index";//TODO correct view
        }
    }
}
