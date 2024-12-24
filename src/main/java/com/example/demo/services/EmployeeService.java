package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entities.Employee;
import com.example.demo.mappers.EmployeeMapper;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    EmployeeMapper employeeMapper;

    public EmployeeDTO get(String id) {
        System.out.println();
        System.out.println("id   "+ id);
        Employee employee = employeeDao.findById(id).orElse(null);
        return employeeMapper.toDTO(employee);
    }
    

    
    public EmployeeDTO save(EmployeeDTO dto){
        Employee employee = employeeDao.findById(dto.getId()).orElse(new Employee());
        employee = employeeMapper.fromDTO(dto, employee);
        return employeeMapper.toDTO(employeeDao.save(employee));
    }
}
