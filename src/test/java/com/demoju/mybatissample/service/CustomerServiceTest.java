package com.demoju.mybatissample.service;

import com.demoju.mybatissample.dto.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class CustomerServiceTest {

    @Autowired CustomerService customerService;

    @Test
    @Commit
    public void save() {
        CustomerDto customer = new CustomerDto();
        customer.setId(2L);
        customer.setName("이민주");
        customer.setEmail("dmysonic@gmail.com");
        customerService.save(customer);
    }

}