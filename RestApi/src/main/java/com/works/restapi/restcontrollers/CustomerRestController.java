package com.works.restapi.restcontrollers;

import com.works.restapi.entities.Customer;
import com.works.restapi.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("customer")
public class CustomerRestController {

    private final CustomerService customerService;

    @PostMapping("register")
    public Customer registerCustomer(@RequestBody Customer customer) {
        return customerService.register(customer);
    }

}
