package org.example.relationsjpa2.dao.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "departmentsss")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String departmentName;
    @OneToMany(mappedBy = "department")
    private List<Customer> customer;

    public Department() {
    }

    public Department(Long id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
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
}
