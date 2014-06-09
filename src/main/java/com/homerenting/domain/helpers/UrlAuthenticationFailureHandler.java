package com.homerenting.domain.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Arthur on 29/05/14.
 */
public class UrlAuthenticationFailureHandler implements AuthenticationFailureHandler {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(UrlAuthenticationFailureHandler.class);

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException ae) throws IOException, ServletException {
        slf4jLogger.info("==onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException ae)==");
        handle(request, response, ae);
    }
    protected void handle(HttpServletRequest request,HttpServletResponse response, AuthenticationException ae) throws IOException {
        slf4jLogger.info("==handle(HttpServletRequest request,HttpServletResponse response, AuthenticationException ae)==");

        slf4jLogger.info(ae.getMessage());

        String targetUrl = "/login/new?auth=" + ae.getMessage();

        if (response.isCommitted()) {
            slf4jLogger.debug("Response has already been committed. Unable to redirect to " + targetUrl);
            return;
        }

        redirectStrategy.sendRedirect(request, response, targetUrl);
    }
}
