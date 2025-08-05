package com.works.restapi.restcontrollers;

import com.works.restapi.entities.Admin;
import com.works.restapi.services.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("admin")
public class AdminRestController {

    private final AdminService adminService;

    @PostMapping("login")
    public boolean login(@RequestBody Admin admin){
        return adminService.login(admin);
    }

}
