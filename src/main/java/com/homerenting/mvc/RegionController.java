package com.homerenting.mvc;

import com.homerenting.domain.Region;
import com.homerenting.services.IRegionService;
import com.homerenting.services.RegionServiceImpl;
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

@Controller(RegionController.COMPONENT_NAME)
@RequestMapping("api")
public class RegionController {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(RegionController.class);

    public static final String COMPONENT_NAME = "regionController";

    @Qualifier(RegionServiceImpl.COMPONENT_NAME)
    @Autowired
    private IRegionService regionService;

    @RequestMapping(value = "regions", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Region> displaySortedRegions(Model model) {
        slf4jLogger.info("==List<Region> displaySortedRegions(Model model)==");
        return regionService.getAllOrderedByName();
    }

    @RequestMapping("regions/all/{namePattern}")
    @ResponseStatus(HttpStatus.FOUND)
    @ResponseBody
    public List<Region> getAllByNamePattern(@PathVariable String namePattern) {
        slf4jLogger.info("==List<Region> getAllByNamePattern(@PathVariable String namePattern)==");
        return regionService.getAllByNamePattern(namePattern);
    }

    @RequestMapping("region/one/{name}")
    @ResponseStatus(HttpStatus.FOUND)
    @ResponseBody
    public Region getByName(@PathVariable String name) {
        slf4jLogger.info("==Region getByName(@PathVariable String name)==");
        return regionService.getByName(name);
    }

    @RequestMapping("region/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    @ResponseBody
    public Region getById(@PathVariable Long id) {
        slf4jLogger.info("==Region getById(@PathVariable Long id)==");
        return regionService.getById(id);
    }

    // handles region form submit
    @RequestMapping(value="region", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public String registerNewRegion(@Valid @ModelAttribute("newRegion") Region newRegion, BindingResult result, Model model) {
        slf4jLogger.info("==String registerNewRegion(@Valid @ModelAttribute(\"newRegion\") Region newRegion, BindingResult result, Model model)==");
        if (!result.hasErrors()) {
            regionService.save(newRegion);
            return "redirect:/";
        } else {
            model.addAttribute("regions", regionService.getAllOrderedByName());
            return "index";//TODO correct view
        }
    }
}
