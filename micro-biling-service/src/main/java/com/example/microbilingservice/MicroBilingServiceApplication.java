package com.example.microbilingservice;

import com.example.microbilingservice.dtos.InvoiceRequestDTO;
import com.example.microbilingservice.service.InvoiceService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
@EnableFeignClients
public class MicroBilingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroBilingServiceApplication.class, args);
    }
//    @Bean
//    CommandLineRunner strat(InvoiceService invoiceService) {
//        return args -> {
//           invoiceService.save(new InvoiceRequestDTO(BigDecimal.valueOf(67000),"C01"));
//           invoiceService.save(new InvoiceRequestDTO(BigDecimal.valueOf(45000),"C01"));
//           invoiceService.save(new InvoiceRequestDTO(BigDecimal.valueOf(12000),"C02"));
//        };
//    }

}
