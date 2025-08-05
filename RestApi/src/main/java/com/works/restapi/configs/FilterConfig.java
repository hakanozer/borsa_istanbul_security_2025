package com.works.restapi.configs;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.IOException;

@Configuration
public class FilterConfig implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req =  (HttpServletRequest) servletRequest;
        HttpServletResponse res =  (HttpServletResponse) servletResponse;

        String url = req.getRequestURI();
        String username = "";
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            username = auth.getName();
        }
        long time = System.currentTimeMillis();

        System.out.println("url: " + url + " username: " + username + " time: " + time);
        filterChain.doFilter(req,res);
    }

}
