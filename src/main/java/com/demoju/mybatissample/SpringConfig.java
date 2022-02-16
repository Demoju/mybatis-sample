package com.demoju.mybatissample;

import com.demoju.mybatissample.mapper.CustomerMapper;
import com.demoju.mybatissample.service.CustomerService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Bean
    public CustomerService customerService() {
        return new CustomerService(sqlSessionTemplate);
    }
}
