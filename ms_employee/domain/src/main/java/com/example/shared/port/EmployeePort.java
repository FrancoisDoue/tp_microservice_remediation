package com.example.shared.port;

import com.example.shared.dto.impl.EmployeeDTO;

import java.util.List;

public interface EmployeePort {
    EmployeeDTO getById(int id);
    List<EmployeeDTO> getAll();
    EmployeeDTO save(EmployeeDTO employee);
    EmployeeDTO update(EmployeeDTO employee);

}
