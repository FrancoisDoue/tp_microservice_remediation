package com.example.domain.entity;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String job;

    public Employee() {
    }

    public Employee(int id, String firstname, String lastname, String email, String job) {
        this(firstname, lastname, email, job);
        this.id = id;
    }

    public Employee(String firstname, String lastname, String email, String job) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.job = job;
    }

    public Employee(int id) {
        this.id = id;
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
