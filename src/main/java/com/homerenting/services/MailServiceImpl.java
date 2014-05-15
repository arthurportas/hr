package com.homerenting.services;

import freemarker.template.TemplateException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.*;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import freemarker.template.Configuration;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Arthur on 09/05/14.
 */
@Service
public class MailServiceImpl implements IMailService{

    private static final Logger slf4jLogger = LoggerFactory.getLogger(MailServiceImpl.class);

    public static final String COMPONENT_NAME = "mailServiceImpl";

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private Configuration freemarkerConfiguration;

    public void setFreemarkerConfiguration(Configuration freemarkerConfiguration) {
        this.freemarkerConfiguration = freemarkerConfiguration;
    }

    @Override
    public void sendUserRegistrationMessage(final String from, final String to, final String subject, final Map<String,Object> model, final String template) {

        slf4jLogger.info("==sendUserRegistrationMessage(String from, String to, String subject, String body)==");


        MimeMessagePreparator preparator = new MimeMessagePreparator() {
            public void prepare(MimeMessage mimeMessage) throws Exception {
                MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
                message.setFrom(from, "Raissi JSF2 sample");
                message.setTo(to);
                message.setSubject(subject);
                //template sample: "com/raissi/freemarker/confirm-register.ftl"
                String text = FreeMarkerTemplateUtils.processTemplateIntoString(freemarkerConfiguration.getTemplate(template, "UTF-8"), model);
                message.setText(text, true);
            }
        };
        mailSender.send(preparator);

    }

    @Override
    public void sendUserRegistrationMessage(final String from, final String to, final String subject) {

    }

    @Override
    public void sendUserRegistrationMessage(final String from, final String to, final String subject, final String body) {

        slf4jLogger.info("==sendUserRegistrationMessage(String from, String to, String subject, String body)==");

        SimpleMailMessage email = new SimpleMailMessage();
        email.setFrom(from);
        email.setTo(to);
        email.setSubject(subject);
        email.setText(body);
        try {
            mailSender.send(email);
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
    }

    @Override
    public void sendUserRegistrationMessageWithTemplate(String from, String to, String subject, String template, Map<String, Object> model) {
        slf4jLogger.info("==void sendUserRegistrationMessageWithTemplate(String from, String to, String subject, String template, Map<String, Object> model)==");
        SimpleMailMessage email = new SimpleMailMessage();
        email.setFrom(from);
        email.setTo(to);
        email.setSubject(subject);
        String text = StringUtils.EMPTY;
        try {
            text = FreeMarkerTemplateUtils.processTemplateIntoString(freemarkerConfiguration.getTemplate(template, "UTF-8"), model);
        } catch (IOException ioe) {
            slf4jLogger.info("==IOException==");
            slf4jLogger.info(ioe.getMessage());
        } catch (TemplateException te) {
            slf4jLogger.info("==TemplateException==");
            slf4jLogger.info(te.getMessage());
        }
        email.setText(text);
        try {
            mailSender.send(email);
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
    }

    @Override
    public void sendUserRegistrationMessageHTML(final String from, final String to) {

    }

    @Override
    public void sendUserRegistrationMessageHTML(final String from, final String to, final String subject) {

    }

    @Override
    public void sendUserRegistrationMessageHTML(final String from, final String to, final String subject, final String body) {

    }

    @Override
    public void sendAccountActivatedMessage(final String from, final String to) {

    }

    @Override
    public void sendAccountActivatedMessage(final String from, final String to, final String subject) {

    }

    @Override
    public void sendAccountActivatedMessage(final String from, final String to, final String subject, final String body) {

    }

    @Override
    public void sendAccountActivatedMessageHTML(final String from, final String to) {

    }

    @Override
    public void sendAccountActivatedMessageHTML(final String from, final String to, final String subject) {

    }

    @Override
    public void sendAccountActivatedMessageHTML(final String from, final String to, final String subject, final String body) {

    }

    @Override
    public void sendUserPasswordChangeRequestMessage(String from, String to, String subject, Map<String, Object> model, String template) {

    }

    @Override
    public void sendUserPasswordChangeRequestMessage(String from, String to, String subject) {

    }

    @Override
    public void sendUserPasswordChangeRequestMessage(String from, String to, String subject, String body) {

    }

    @Override
    public void sendUserPasswordChangeRequestMessageWithTemplate(String from, String to, String subject, String template, Map<String, Object> model) {
        slf4jLogger.info("==void sendUserPasswordChangeRequestMessageWithTemplate(String from, String to, String subject, String template, Map<String, Object> model)==");
        SimpleMailMessage email = new SimpleMailMessage();
        email.setFrom(from);
        email.setTo(to);
        email.setSubject(subject);
        String text = StringUtils.EMPTY;
        try {
            text = FreeMarkerTemplateUtils.processTemplateIntoString(freemarkerConfiguration.getTemplate(template, "UTF-8"), model);
        } catch (IOException ioe) {
            slf4jLogger.info("==IOException==");
            slf4jLogger.info(ioe.getMessage());
        } catch (TemplateException te) {
            slf4jLogger.info("==TemplateException==");
            slf4jLogger.info(te.getMessage());
        }
        email.setText(text);
        try {
            mailSender.send(email);
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
    }
}
