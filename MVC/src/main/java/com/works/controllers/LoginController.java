package com.works.controllers;

import ch.qos.logback.core.model.Model;
import com.works.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class LoginController {

    private final CustomerService customerService;

    @GetMapping("")
    public String login(){
        return "login";
    }

    @PostMapping("userLogin")
    public String userLogin(@RequestParam String email, @RequestParam String password){
        boolean status = customerService.login(email, password);
        if (status){
            return "redirect:/dashboard";
        }
        return "login";
    }

}
