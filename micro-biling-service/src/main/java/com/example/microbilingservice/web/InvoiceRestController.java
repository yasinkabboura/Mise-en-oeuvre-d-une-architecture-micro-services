package com.example.microbilingservice.web;

import com.example.microbilingservice.dtos.InvoiceRequestDTO;
import com.example.microbilingservice.dtos.InvoiceResponseDTO;
import com.example.microbilingservice.service.InvoiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class InvoiceRestController {
    private InvoiceService invoiceService;

    public InvoiceRestController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }
    @GetMapping(path = "/invoices/{id}")
    public InvoiceResponseDTO getInvoice(@PathVariable(name = "id") String invoiceId){
        return invoiceService.getInvoice(invoiceId);
    }
    @PostMapping(path = "/invoices")
    public InvoiceResponseDTO save(@RequestBody InvoiceRequestDTO invoiceRequestDTO) throws Exception {
        return invoiceService.save(invoiceRequestDTO);
    }
    @GetMapping(path = "/invoicesByCustomerId/{customerId}")
    public List<InvoiceResponseDTO> getInvoicesByCustomer(@PathVariable(name = "customerId") String customerId){
        return invoiceService.invoiceByCustomerId(customerId);
    }
    @GetMapping(path = "/invoices")
    public List<InvoiceResponseDTO> allInvoices(){
        return invoiceService.allInvoices();
    }

}






















