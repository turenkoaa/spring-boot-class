package com.db.springbootclass.cotroller;

import com.db.iron_bank_starter.frontend_convention.FrontEndConventionRestController;
import com.db.springbootclass.model.Customer;
import com.db.springbootclass.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@FrontEndConventionRestController
public class DataController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/data/lanister")
    public Customer getLanister(){
        return customerService.findLanister();
    }
}
