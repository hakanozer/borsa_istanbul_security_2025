package com.works.configs;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class FilterConfig implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;

        String url = req.getRequestURI();


        String[] urls = {"/", "/userLogin"};
        boolean status = false;

        for (String url1 : urls) {
            if (url.equals(url1)) {
                status = true;
                break;
            }
        }
        if (status){
            filterChain.doFilter(req, res);
        }else {
            // session control
            Object auth = (String) req.getSession().getAttribute("user");
            if (auth != null){
                req.setAttribute("user", auth);
                filterChain.doFilter(req, res);
            }else {
                res.sendRedirect("/");
            }
        }


    }

}
