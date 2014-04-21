package com.homerenting.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Arthur on 21/04/14.
 */
@Controller
@RequestMapping("/email")
public class MailController {

    @Autowired
    private JavaMailSender mailSender;

    @RequestMapping(value="/one", method = RequestMethod.POST)
    public String sendOneEmail(HttpServletRequest request) {
        // takes input from e-mail form
        String recipientAddress = request.getParameter("recipient");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");

        // prints debug info
        System.out.println("To: " + recipientAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);

        // creates a simple e-mail object
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(recipientAddress);
        email.setSubject(subject);
        email.setText(message);

        // sends the e-mail
        mailSender.send(email);

        // forwards to the view named "Result"
        return "mail-result";
    }
}
