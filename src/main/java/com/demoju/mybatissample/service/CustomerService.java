package com.demoju.mybatissample.service;

import com.demoju.mybatissample.dto.CustomerDto;
import com.demoju.mybatissample.mapper.CustomerMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CustomerService {
    private final CustomerMapper customerMapper;

    public CustomerService(SqlSessionTemplate sqlSessionTemplate) {
        this.customerMapper = sqlSessionTemplate.getMapper(CustomerMapper.class);
    }

    public CustomerDto save(CustomerDto customerDto) {
        customerMapper.save(customerDto);
        return customerDto;
    }
}
