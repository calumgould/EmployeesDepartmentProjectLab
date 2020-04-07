package com.example.codeclan.EmployeeLab.controllers;

import com.example.codeclan.EmployeeLab.models.Department;
import com.example.codeclan.EmployeeLab.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public class DepartmentController {
    
    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping(value = "/departments")
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }

    @GetMapping(value = "/departments/{id}")
    public Optional<Department> getDepartments(@PathVariable Long id){
        return departmentRepository.findById(id);
    }
}
