package com.example.shared.dto.impl;

import com.example.domain.entity.Task;
import com.example.shared.dto.DTO;

public class TaskDTO implements DTO<TaskDTO, Task> {

    private int id;
    private String title;
    private String description;
    private int priority;
    private boolean done;
//    private EmployeeDTO employee;

    @Override
    public Task toEntity() {
        return new Task(id, title, description, priority, done, 0);
    }

    @Override
    public TaskDTO fromEntity(Task task) {
        this.id = task.getId();
        this.title = task.getTitle();
        this.description = task.getDescription();
        this.priority = task.getPriority();
        this.done = task.isDone();
        return this;
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

}
