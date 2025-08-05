package com.works.services;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final HttpServletRequest req;

    public boolean login(String email, String password){
        if (email.equals("ali@mail.com") && password.equals("123456")){
            req.getSession().setAttribute("user",email);
            return true;
        }
        return false;
    }

}
