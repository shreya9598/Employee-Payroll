package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {

    String id = "";
    String name;
    String email;
    String phone;
    private String designation;
    private String department;
    private Long salaryStructureId;
    
}
