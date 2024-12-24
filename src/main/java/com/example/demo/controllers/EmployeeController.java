package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;    

    @GetMapping("/{id}")
    public EmployeeDTO getMethodName(@PathVariable String id) {
        return employeeService.get(id);
    }
    

    @PostMapping("")
    public EmployeeDTO save(@RequestBody EmployeeDTO dto) {      
        return employeeService.save(dto);
        
    }
    
    @PutMapping("/{id}")
    public EmployeeDTO update(@PathVariable String id, @RequestBody EmployeeDTO dto) {      
        dto.setId(id);
        return employeeService.save(dto);
        
    }
    
}
