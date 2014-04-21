package com.homerenting.mvc;

import com.homerenting.domain.modules.header.contacts.EmailContact;
import com.homerenting.validators.ContactFormValidator;
import com.homerenting.validators.LoginFormValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mail.*;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Arthur on 21/04/14.
 */
@Controller
@RequestMapping("/email")
public class MailController {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    ContactFormValidator contactFormValidator;

    @RequestMapping(value="/one/plain", method = RequestMethod.POST,
            headers = {"Content-type=application/json"})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView sendOneEmail(@RequestBody EmailContact emailContact,
                               BindingResult result,
                               SessionStatus status,
                               HttpServletRequest request) {

        String viewName = "mail-error";

        ModelAndView mav = new ModelAndView(viewName);
        contactFormValidator.validate(emailContact, result);

        if (result.hasErrors()){
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
            //log
            if(me instanceof MailParseException){

            }else if (me instanceof MailAuthenticationException){

            }else if (me instanceof MailSendException){

            }
        }
        return mav;
    }
    @RequestMapping(value="/one/plain/html", method = RequestMethod.POST, headers = {"Content-type=application/json"})
    public String sendOneEmailHTML(@RequestBody EmailContact emailContact) {

        //validator??

        // creates a simple e-mail object
        SimpleMailMessage email = new SimpleMailMessage();
        email.setFrom(emailContact.getEmailFrom());
        email.setTo(emailContact.getEmailFrom());//to should be hardcoded as it's company contact
        email.setSubject("subject");
        email.setText(emailContact.getMessage());

        // sends the e-mail
        try {
            mailSender.send(email);
            return "mail-success";
        }catch (MailException me){
            //log
        }
        return "mail-error";
    }
}
