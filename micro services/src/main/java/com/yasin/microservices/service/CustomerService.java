package com.yasin.microservices.service;

import com.yasin.microservices.dto.CustomerRequestDto;
import com.yasin.microservices.dto.CustomerResponseDto;

import java.util.List;

public interface CustomerService {
    CustomerResponseDto save (CustomerRequestDto customerRequestDto);
    CustomerResponseDto getCustomer (String id);
    CustomerResponseDto update (CustomerRequestDto customerRequestDto);
    List<CustomerResponseDto> listCustomers();


}
