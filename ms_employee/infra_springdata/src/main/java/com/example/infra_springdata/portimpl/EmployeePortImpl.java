package com.example.infra_springdata.portimpl;

import com.example.infra_springdata.entity.EmployeeEntity;
import com.example.infra_springdata.repository.EmployeeRepository;
import com.example.shared.dto.impl.EmployeeDTO;
import com.example.shared.port.EmployeePort;

import java.util.List;

public class EmployeePortImpl implements EmployeePort {

    private final EmployeeRepository employeeRepository;

    public EmployeePortImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    private static EmployeeDTO convert(EmployeeEntity employee) {
        return new EmployeeDTO(
                employee.getId(),
                employee.getFirstname(),
                employee.getLastname(),
                employee.getEmail(),
                employee.getJob()
        );
    }

    @Override
    public EmployeeDTO getById(int id) {
        EmployeeEntity employee = employeeRepository.findById(id).orElse(null);
        if (employee == null) return null;
        return convert(employee);
    }

    @Override
    public List<EmployeeDTO> getAll() {
        return employeeRepository.findAll().stream().map(EmployeePortImpl::convert).toList();
    }

    @Override
    public EmployeeDTO save(EmployeeDTO employee) {
        EmployeeEntity entity = new EmployeeEntity(employee.getId(), employee.getFirstname(), employee.getLastname(), employee.getEmail(), employee.getJob());
        return convert(employeeRepository.save(entity));
    }

    @Override
    public EmployeeDTO update(EmployeeDTO employee) {
        return save(employee);
    }
}
