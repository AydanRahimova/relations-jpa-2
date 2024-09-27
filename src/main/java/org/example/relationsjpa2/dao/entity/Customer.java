package org.example.relationsjpa2.dao.entity;

import jakarta.persistence.*;
import org.example.relationsjpa2.enums.Job;

import java.time.LocalDate;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    @Enumerated(EnumType.STRING)
    private Job jobPosition;
    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    private Account account;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Customer() {
    }

    public Customer(Long id, String name, String surname, LocalDate birthDate, Job jobPosition) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.jobPosition = jobPosition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Job getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(Job jobPosition) {
        this.jobPosition = jobPosition;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
        public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", jobPosition=" + jobPosition +
                '}';
    }
}
