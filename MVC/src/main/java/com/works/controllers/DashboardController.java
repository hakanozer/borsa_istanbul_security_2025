package com.works.controllers;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class DashboardController {

    private final HttpServletRequest req;

    @GetMapping("dashboard")
    public String dashboard(){
        if (req.getSession().getAttribute("user") == null){
            return "redirect:/";
        }
        return "dashboard";
    }

}
