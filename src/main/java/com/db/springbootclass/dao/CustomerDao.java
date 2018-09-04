package com.db.springbootclass.dao;

import com.db.springbootclass.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;


public interface CustomerDao extends CrudRepository<Customer, Long> {
    @RestResource(path = "byAmount")
    List<Customer> findByIncomeGreaterThan(@Param("amount") int amount);

    Customer findByName(String name);
}
