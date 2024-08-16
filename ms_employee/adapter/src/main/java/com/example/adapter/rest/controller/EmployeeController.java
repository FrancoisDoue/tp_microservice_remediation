package com.example.adapter.rest.controller;

import com.example.domain.entity.Employee;
import com.example.domain.service.EmployeeService;
import com.example.shared.dto.impl.EmployeeDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
        return ResponseEntity.ok(
                employeeService.getAllEmployees().stream()
                        .map(e -> new EmployeeDTO().fromEntity(e))
                        .toList()
        );
    }

    @PostMapping
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return new ResponseEntity<>(
                new EmployeeDTO().fromEntity(employeeService.createEmployee(employeeDTO.toEntity())),
                HttpStatus.CREATED
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable Integer id) {
        return ResponseEntity.ok(
                new EmployeeDTO().fromEntity(employeeService.getEmployeeById(id))
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable Integer id, @RequestBody EmployeeDTO employeeDTO) {
        Employee entity = employeeService.updateEmployee(id, employeeDTO.toEntity());
        return ResponseEntity.ok(new EmployeeDTO().fromEntity(entity));
    }
}
