package com.example.domain.service;

import com.example.domain.entity.Employee;
import com.example.shared.dto.impl.EmployeeDTO;
import com.example.shared.port.EmployeePort;

import java.util.List;

public class EmployeeService {
    private final EmployeePort employeePort;
    public EmployeeService(EmployeePort employeePort) {
        this.employeePort = employeePort;
    }

    public List<Employee> getAllEmployees() {
        return employeePort.getAll().stream().map(EmployeeDTO::toEntity).toList();
    }

    public Employee getEmployeeById(Integer id) {
        return employeePort.getById(id).toEntity();
    }

    public Employee createEmployee(Employee employee) {
        return employeePort.save(new EmployeeDTO().fromEntity(employee)).toEntity();
    }
    public Employee updateEmployee(Integer id, Employee employee) {
        Employee employeeToUpdate = employeePort.getById(id).toEntity();
        employeeToUpdate.setId(id);
        employeeToUpdate.setFirstname(employee.getFirstname());
        employeeToUpdate.setLastname(employee.getLastname());
        employeeToUpdate.setEmail(employee.getEmail());
        return employeePort.update(new EmployeeDTO().fromEntity(employeeToUpdate)).toEntity();
    }

}
