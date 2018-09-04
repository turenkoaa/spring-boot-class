package com.db.springbootclass.service;

import com.db.springbootclass.dao.CustomerDao;
import com.db.springbootclass.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("WINTER_IS_HERE")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @EventListener(ContextRefreshedEvent.class)
    @Transactional
    public void initDB(){
        customerDao.save(Customer.builder().name("Lanister").income(1000).build());
        customerDao.save(Customer.builder().name("Stark").income(1000).build());
        customerDao.save(Customer.builder().name("Bagration").income(1000).build());
    }

    @Override
    @Transactional
    public int howMuchIncome(String name){
        return customerDao.findByName(name).getIncome();
    }

    @Override
    public Customer findLanister() {
        return customerDao.findByName("Lanister");
    }
}
