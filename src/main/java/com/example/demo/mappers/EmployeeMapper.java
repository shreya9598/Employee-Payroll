package com.example.demo.mappers;

import org.springframework.stereotype.Component;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entities.Employee;

@Component
public class EmployeeMapper {

    public EmployeeDTO toDTO(Employee employee){
        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        dto.setEmail(employee.getEmail());
        dto.setPhone(employee.getPhone());
        dto.setDesignation(employee.getDesignation());
        dto.setDepartment(employee.getDepartment());
        dto.setSalaryStructureId(employee.getSalaryStructureId());

        return dto;
    }

    public Employee fromDTO(EmployeeDTO dto, Employee employee){
        employee.setName(dto.getName());
        employee.setEmail(dto.getEmail());
        employee.setPhone(dto.getPhone());
        employee.setDesignation(dto.getDesignation());
        employee.setDepartment(dto.getDepartment());
        employee.setSalaryStructureId(dto.getSalaryStructureId());

        return employee;
    }
    
}
