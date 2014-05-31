package com.homerenting.domain.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Arthur on 29/05/14.
 */
public class UrlAuthenticationFailureHandler implements AuthenticationFailureHandler {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(UrlAuthenticationFailureHandler.class);

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        slf4jLogger.info("==onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, Authentication authentication)==");
        slf4jLogger.debug(e.getMessage());
    }
}
