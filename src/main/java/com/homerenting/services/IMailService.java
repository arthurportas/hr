package com.homerenting.services;

import com.homerenting.domain.User;
import com.homerenting.domain.UserShortProfile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface IMailService {

    public void sendUserRegistrationMessage(final String from, final String to, final String subject, final Map<String,Object> model, final String template);

    public void sendUserRegistrationMessage(final String from, String to, final String subject);

    public void sendUserRegistrationMessage(final String from, final String to, final String subject, final String body);

    public void sendUserRegistrationMessageWithTemplate(final String from, final String to, final String subject, final String template, final Map<String,Object> model);

    public void sendUserRegistrationMessageHTML(final String from, final String to);

    public void sendUserRegistrationMessageHTML(final String from, final String to, final String subject);

    public void sendUserRegistrationMessageHTML(final String from, final String to, final String subject, final String body);

    public void sendAccountActivatedMessage(final String from, final String to);

    public void sendAccountActivatedMessage(final String from, final String to, final String subject);

    public void sendAccountActivatedMessage(final String from, final String to, final String subject, final String body);

    public void sendAccountActivatedMessageHTML(final String from, final String to);

    public void sendAccountActivatedMessageHTML(final String from, final String to, final String subject);

    public void sendAccountActivatedMessageHTML(final String from, final String to, final String subject, final String body);
}
