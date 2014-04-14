package com.homerenting.mvc;

import com.homerenting.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Arthur on 14/04/14.
 */

@Component
public class AuthenticationInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();

        if (!uri.endsWith("login") && !uri.endsWith("logout")) {
            User userData = (User) request.getSession().getAttribute("LOGGEDIN_USER");
            if (userData == null) {
                response.sendRedirect("home");
                return false;
            }
        }
        return true;
    }
}
