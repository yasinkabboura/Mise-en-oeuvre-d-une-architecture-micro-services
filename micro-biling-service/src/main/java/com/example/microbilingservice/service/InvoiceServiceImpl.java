package com.example.microbilingservice.service;

import com.example.microbilingservice.dtos.InvoiceRequestDTO;
import com.example.microbilingservice.dtos.InvoiceResponseDTO;
import com.example.microbilingservice.entities.Customer;
import com.example.microbilingservice.entities.Invoice;
import com.example.microbilingservice.mappers.InvoiceMapper;
import com.example.microbilingservice.openfeign.CustomerRestClient;
import com.example.microbilingservice.repositories.InvoiceRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class InvoiceServiceImpl implements InvoiceService {
    private InvoiceRepository invoiceRepository;
    private InvoiceMapper invoiceMapper;
    private CustomerRestClient customerRestClient;

    public InvoiceServiceImpl(InvoiceRepository invoiceRepository, InvoiceMapper invoiceMapper, CustomerRestClient customerRestClient) {
        this.invoiceRepository = invoiceRepository;
        this.invoiceMapper = invoiceMapper;
        this.customerRestClient = customerRestClient;
    }

    @Override
    public InvoiceResponseDTO save(InvoiceRequestDTO invoiceRequestDTO) throws Exception {
        Customer customer = customerRestClient.getCustomer(invoiceRequestDTO.getClientId());
        if(customer!=null){
            Invoice invoice = invoiceMapper.invoiceRequestDtoToInvoice(invoiceRequestDTO);
            invoice.setId(UUID.randomUUID().toString());
            invoice.setDate(new Date());
            Invoice savedInvoice = invoiceRepository.save(invoice);
            savedInvoice.setCustomer(customer);
            return invoiceMapper.invoiceToInvoiceResponse(savedInvoice);
        }else {
            throw new Exception("there is no customer with that id");
        }

    }

    @Override
    public InvoiceResponseDTO getInvoice(String invoiceId) {
        Invoice invoice = invoiceRepository.findById(invoiceId).get();
        Customer customer = customerRestClient.getCustomer(invoice.getClientId());
        invoice.setCustomer(customer);
        return invoiceMapper.invoiceToInvoiceResponse(invoice);
    }

    @Override
    public List<InvoiceResponseDTO> invoiceByCustomerId(String customerID) {
        List<Invoice> invoiceList = invoiceRepository.findByClientId(customerID);
        invoiceList.forEach(invoice -> {
            Customer customer = customerRestClient.getCustomer(invoice.getClientId());
            invoice.setCustomer(customer);
        });
        return invoiceList.stream().map(invoice -> invoiceMapper.invoiceToInvoiceResponse(invoice)).collect(Collectors.toList());
    }
    @Override
    public List<InvoiceResponseDTO> allInvoices() {
        List<Invoice> invoiceList = invoiceRepository.findAll();
        invoiceList.forEach(invoice -> {
            Customer customer = customerRestClient.getCustomer(invoice.getClientId());
            invoice.setCustomer(customer);
        });
        return invoiceList.stream().map(invoice -> invoiceMapper.invoiceToInvoiceResponse(invoice)).collect(Collectors.toList());
    }
}
