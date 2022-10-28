package com.yasin.microservices.mappers;

import com.yasin.microservices.dto.CustomerRequestDto;
import com.yasin.microservices.dto.CustomerResponseDto;
import com.yasin.microservices.entities.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.web.bind.annotation.ModelAttribute;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerResponseDto customerToCustomerResponse(Customer customer);
    Customer customerRequestDtoToCustomer(CustomerRequestDto customerRequestDto);
}
