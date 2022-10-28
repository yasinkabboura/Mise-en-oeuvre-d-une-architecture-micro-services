package com.example.microbilingservice.service;

import com.example.microbilingservice.dtos.InvoiceRequestDTO;
import com.example.microbilingservice.dtos.InvoiceResponseDTO;

import java.util.List;

public interface InvoiceService {
    InvoiceResponseDTO save(InvoiceRequestDTO invoiceRequestDTO) throws Exception;
    InvoiceResponseDTO getInvoice(String invoiceId);
    List<InvoiceResponseDTO> invoiceByCustomerId(String customerID);
    List<InvoiceResponseDTO> allInvoices();
}
