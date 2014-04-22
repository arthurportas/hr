package com.homerenting.mvc;

import com.homerenting.domain.modules.header.contacts.EmailContact;
import com.homerenting.validators.ContactFormValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mail.*;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Arthur on 21/04/14.
 */
@Controller
@RequestMapping("/email")
public class MailController {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(MailController.class);

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    ContactFormValidator contactFormValidator;

    @RequestMapping(value="/one/plain", method = RequestMethod.POST,
            headers = {"Content-type=application/json"})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView sendOneEmail(@RequestBody EmailContact emailContact,
                               BindingResult result) {

        slf4jLogger.info("==ModelAndView sendOneEmail(@RequestBody EmailContact emailContact,\n" +
                "                               BindingResult result)==");
        String viewName = "mail-error";

        ModelAndView mav = new ModelAndView(viewName);
        contactFormValidator.validate(emailContact, result);

        if (result.hasErrors()){
            mav.addObject("errors", result.getAllErrors());//TODO display friendly errors on frontend
            return mav;
        }

        // creates a simple e-mail object
        SimpleMailMessage email = new SimpleMailMessage();
        email.setFrom(emailContact.getEmailFrom());
        email.setTo(emailContact.getEmailFrom());//to should be hardcoded as it's company contact
        email.setSubject("subject");
        email.setText(emailContact.getMessage());

        // sends the e-mail
        try {
            mailSender.send(email);
            mav.setViewName("mail-success");
            return mav;
        }catch (MailException me){
            if(me instanceof MailParseException){
                slf4jLogger.info("==MailParseException==");
                slf4jLogger.info(me.getMessage());
            }else if (me instanceof MailAuthenticationException){
                slf4jLogger.info("==MailAuthenticationException==");
                slf4jLogger.info(me.getMessage());
            }else if (me instanceof MailSendException){
                slf4jLogger.info("==MailSendException==");
                slf4jLogger.info(me.getMessage());
            }
        }
        return mav;
    }
    @RequestMapping(value="/one/plain/html", method = RequestMethod.POST, headers = {"Content-type=application/json"})
    public String sendOneEmailHTML(@RequestBody EmailContact emailContact) {

        //TODO implement login
        return null;
    }
}
