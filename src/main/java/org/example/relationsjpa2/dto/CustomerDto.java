package org.example.relationsjpa2.dto;

import org.example.relationsjpa2.enums.Job;

import java.time.LocalDate;

public class CustomerDto {
    private Long id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private Job jobPosition;
    private AccountDto account;
    private DepartmentDto department;

    public CustomerDto() {
    }

    public CustomerDto(Long id, String name, String surname, LocalDate birthDate, Job jobPosition) {
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

    public DepartmentDto getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDto department) {
        this.department = department;
    }
 public AccountDto getAccount() {
        return account;
    }

    public void setAccount(AccountDto account) {
        this.account = account;
    }
}
