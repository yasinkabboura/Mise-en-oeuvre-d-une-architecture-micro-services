package com.example.microbilingservice.mappers;

import com.example.microbilingservice.dtos.InvoiceRequestDTO;
import com.example.microbilingservice.dtos.InvoiceResponseDTO;
import com.example.microbilingservice.entities.Invoice;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {
    InvoiceResponseDTO invoiceToInvoiceResponse(Invoice invoice);
    Invoice invoiceRequestDtoToInvoice(InvoiceRequestDTO invoiceRequestDTO);
}
