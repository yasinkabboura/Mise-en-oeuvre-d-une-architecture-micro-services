package com.yasin.microservices;

import com.yasin.microservices.dto.CustomerRequestDto;
import com.yasin.microservices.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MicroServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServicesApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerService customerService){
        return args -> {
            customerService.save(new CustomerRequestDto("C01","Adria","adria@adria.com"));
            customerService.save(new CustomerRequestDto("C02","OpenLab","open@openLab.com"));
        };
    }

}
