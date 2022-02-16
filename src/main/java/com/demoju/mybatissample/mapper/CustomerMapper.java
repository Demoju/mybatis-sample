package com.demoju.mybatissample.mapper;

import com.demoju.mybatissample.dto.CustomerDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {
    void save(CustomerDto customerDto);
    CustomerDto findById(CustomerDto customerDto);
}
