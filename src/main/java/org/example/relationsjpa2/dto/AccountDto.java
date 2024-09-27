package org.example.relationsjpa2.dto;

import org.example.relationsjpa2.enums.Status;

public class AccountDto {
    private Long id;
    private Status status;
    private CustomerDto customer;

    public AccountDto() {
    }

    public AccountDto(Long id, Status status, CustomerDto customer) {
        this.id = id;
        this.status = status;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public CustomerDto getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDto customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "AccountDto{" +
                "id=" + id +
                ", status=" + status +
                '}';
    }
}
