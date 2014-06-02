package com.homerenting.domain.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collection;

/**
 * Created by Arthur on 29/05/14.
 */
public class UrlAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(UrlAuthenticationSuccessHandler.class);

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        slf4jLogger.info("==onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)==");

        handle(request, response, authentication);
        clearAuthenticationAttributes(request);
    }

    protected void handle(HttpServletRequest request,
                          HttpServletResponse response, Authentication authentication) throws IOException {
        slf4jLogger.info("==handle(HttpServletRequest request,\n" +
                "                          HttpServletResponse response, Authentication authentication) throws IOException ==");

        String targetUrl = determineTargetUrl(authentication);

        if (response.isCommitted()) {
            slf4jLogger.debug("Response has already been committed. Unable to redirect to " + targetUrl);
            return;
        }

        redirectStrategy.sendRedirect(request, response, targetUrl);
    }
    /** Builds the target URL according to the logic defined in the main class Javadoc. */
    protected String determineTargetUrl(Authentication authentication) {
        slf4jLogger.info("==String determineTargetUrl(Authentication authentication)==");
        boolean isUser = false;
        boolean isAdmin = false;
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        for (GrantedAuthority grantedAuthority : authorities) {
            if (grantedAuthority.getAuthority().equals("ROLE_USER")) {
                isUser = true;
                break;
            } else if (grantedAuthority.getAuthority().equals("ROLE_ADMIN")) {
                isAdmin = true;
                break;
            }
        }

        if (isUser) {
            return "/";
        } else if (isAdmin) {
            return "/";
        } else {
            throw new IllegalStateException();//TODO Custom exception to register unrelated user ROLE
        }
    }

    protected void clearAuthenticationAttributes(HttpServletRequest request) {
        slf4jLogger.info("==void clearAuthenticationAttributes(HttpServletRequest request)==");
        HttpSession session = request.getSession(false);
        if (session == null) {
            return;
        }
        session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
    }

    public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
        this.redirectStrategy = redirectStrategy;
    }
    protected RedirectStrategy getRedirectStrategy() {
        return redirectStrategy;
    }
}
