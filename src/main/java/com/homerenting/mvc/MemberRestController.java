package com.homerenting.mvc;

import java.util.List;

import com.homerenting.domain.Member;
import com.homerenting.repo.MemberDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller(MemberRestController.COMPONENT_NAME)
@RequestMapping("/rest/members")
public class MemberRestController {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(LawController.class);

    public static final String COMPONENT_NAME = "memberRestController";

    @Autowired
    private MemberDao memberDao;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody List<Member> listAllMembers() {
        slf4jLogger.info("==List<Member> listAllMembers()==");
        return memberDao.findAllOrderedByName();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Member lookupMemberById(@PathVariable("id") Long id) {
        slf4jLogger.info("==@ResponseBody Member lookupMemberById(@PathVariable(\"id\") Long id)==");
        return memberDao.findById(id);
    }
}
