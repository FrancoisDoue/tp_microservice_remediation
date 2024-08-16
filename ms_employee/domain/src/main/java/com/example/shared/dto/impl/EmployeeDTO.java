package com.example.shared.dto.impl;

import com.example.domain.entity.Employee;
import com.example.shared.dto.DTO;

public class EmployeeDTO implements DTO<EmployeeDTO, Employee> {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String job;

    public EmployeeDTO() {
    }
    public EmployeeDTO(int id, String firstname, String lastname, String email, String job) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.job = job;
    }

    @Override
    public Employee toEntity() {
        return new Employee(id, firstname, lastname, email, job);
    }

    @Override
    public EmployeeDTO fromEntity(Employee employee) {
        this.setId(employee.getId());
        this.setFirstname(employee.getFirstname());
        this.setLastname(employee.getLastname());
        this.setEmail(employee.getEmail());
        this.setJob(employee.getJob());
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
