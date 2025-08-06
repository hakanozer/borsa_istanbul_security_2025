package com.works.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class DashboardController {


    @GetMapping("dashboard")
    public String dashboard(){
        return "dashboard";
    }

    @PostMapping("dataSend")
    public String dataSend(@RequestParam String data, Model model){
        model.addAttribute("data", data);
        return "dashboard";
    }

}
