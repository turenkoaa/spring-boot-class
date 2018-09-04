package com.db.springbootclass.service;


import com.db.springbootclass.model.Customer;

public interface CustomerService {
    int howMuchIncome(String name);
    Customer findLanister();
}
