package com.homerenting.mvc;

import com.homerenting.domain.Parish;
import com.homerenting.services.IParishService;
import com.homerenting.services.ParishServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller(ParishController.COMPONENT_NAME)
@RequestMapping("api")
public class ParishController {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(NewsController.class);

    public static final String COMPONENT_NAME = "parishController";

    @Qualifier(ParishServiceImpl.COMPONENT_NAME)
    @Autowired
    private IParishService parishService;

    @RequestMapping(value = "parishes", method = RequestMethod.GET)
    @ResponseBody
    public List<Parish> displaySortedParishes(Model model) {
        slf4jLogger.info("==List<Parish> displaySortedParishes(Model model)==");
        return parishService.getAllOrderedByName();
    }

    @RequestMapping("parish/{id}")
    @ResponseBody
    public Parish getById(@PathVariable Long id) {
        slf4jLogger.info("==Parish getById(@PathVariable Long id)==");
        return parishService.getById(id);
    }

    // handles parish form submit
    @RequestMapping(value="parish", method=RequestMethod.POST)
    @ResponseBody
    public String registerNewParish(@Valid @ModelAttribute("newParish") Parish newParish, BindingResult result, Model model) {
        slf4jLogger.info("==String registerNewParish(@Valid @ModelAttribute(\"newParish\") Parish newParish, BindingResult result, Model model)==");
        if (!result.hasErrors()) {
            parishService.save(newParish);
            return "redirect:/";
        } else {
            model.addAttribute("parishes", parishService.getAllOrderedByName());
            return "index";//TODO correct view
        }
    }
}
