package com.homerenting.mvc;

import com.homerenting.domain.Parish;
import com.homerenting.services.IParishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("api")
public class ParishController {

    private IParishService parishService;

    @Autowired
    public ParishController(IParishService parishService) {
        this.parishService = parishService;
    }

    @RequestMapping(value = "parishes", method = RequestMethod.GET)
    @ResponseBody
    public List<Parish> displaySortedParishes(Model model) {
        return parishService.getAllOrderedByName();
    }

    @RequestMapping("parish/{id}")
    @ResponseBody
    public Parish getById(@PathVariable Long id) {
        return parishService.getById(id);
    }

    // handles parish form submit
    @RequestMapping(value="parish", method=RequestMethod.POST)
    @ResponseBody
    public String registerNewParish(@Valid @ModelAttribute("newParish") Parish newParish, BindingResult result, Model model) {
        if (!result.hasErrors()) {
            parishService.save(newParish);
            return "redirect:/";
        } else {
            model.addAttribute("parishes", parishService.getAllOrderedByName());
            return "index";//TODO correct view
        }
    }
}
