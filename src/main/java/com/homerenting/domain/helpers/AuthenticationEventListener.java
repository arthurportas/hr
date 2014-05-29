package com.homerenting.domain.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.InteractiveAuthenticationSuccessEvent;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

/**
 * Created by Arthur on 13/05/14.
 */
@Component
public class AuthenticationEventListener implements ApplicationListener<InteractiveAuthenticationSuccessEvent> {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(AuthenticationEventListener.class);

    @Override
    public void onApplicationEvent(InteractiveAuthenticationSuccessEvent authenticationEvent) {
        slf4jLogger.info("==void onApplicationEvent(InteractiveAuthenticationSuccessEvent authenticationEvent)==");
        Authentication authentication = authenticationEvent.getAuthentication();
        String auditMessage = "Login attempt with username: " + authentication.getName() + "\t\tSuccess: " + authentication.isAuthenticated();
        slf4jLogger.debug("==" + auditMessage +"==");
    }
}
