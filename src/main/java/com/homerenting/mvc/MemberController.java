package com.homerenting.mvc;

import javax.validation.Valid;

import com.homerenting.domain.Member;
import com.homerenting.repo.MemberDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller(MemberController.COMPONENT_NAME)
@RequestMapping(value = "/member")
public class MemberController {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(LawController.class);

    public static final String COMPONENT_NAME = "memberController";

    @Autowired
    private MemberDao memberDao;

    @RequestMapping(method = RequestMethod.GET)
    public String displaySortedMembers(Model model) {
        slf4jLogger.info("==String displaySortedMembers(Model model)==");
        model.addAttribute("newMember", new Member());
        model.addAttribute("members", memberDao.findAllOrderedByName());
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String registerNewMember(@Valid @ModelAttribute("newMember") Member newMember, BindingResult result, Model model) {
        slf4jLogger.info("==String registerNewMember(@Valid @ModelAttribute(\"newMember\") Member newMember, BindingResult result, Model model)==");
        if (!result.hasErrors()) {
            memberDao.register(newMember);
            return "redirect:/";
        } else {
            model.addAttribute("members", memberDao.findAllOrderedByName());
            return "index";
        }
    }
}
