package com.example.microbilingservice.dtos;

import com.example.microbilingservice.entities.Customer;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;

public class InvoiceRequestDTO {
    private BigDecimal amount;
    private String clientId;

    public InvoiceRequestDTO(BigDecimal amount, String clientId) {
        this.amount = amount;
        this.clientId = clientId;
    }

    public InvoiceRequestDTO() {
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
