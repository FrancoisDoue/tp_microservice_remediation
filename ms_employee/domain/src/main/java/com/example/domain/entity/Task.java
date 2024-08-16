package com.example.domain.entity;

public class Task {
    private int id;
    private String title;
    private String description;
    private int priority;
    private boolean done;
    private int employeeId;

    public Task() {}

    public Task(int id, String title, String description, int priority, boolean done, int employeeId) {
        this(title, description, priority, done, employeeId);
        this.id = id;
    }

    public Task(String title, String description, int priority, boolean done, int employeeId) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.done = done;
        this.employeeId = employeeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
