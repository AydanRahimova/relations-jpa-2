package org.example.relationsjpa2.dto;

import jakarta.persistence.OneToMany;
import org.example.relationsjpa2.dao.entity.Customer;

import java.util.List;

public class DepartmentDto {
    private Long id;
    private String departmentName;
    private List<Customer> customer;

    public DepartmentDto() {
    }

    public DepartmentDto(Long id, String departmentName, List<Customer> customer) {
        this.id = id;
        this.departmentName = departmentName;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }
}
