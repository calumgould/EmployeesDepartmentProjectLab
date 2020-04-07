package com.example.codeclan.EmployeeLab.controllers;

import com.example.codeclan.EmployeeLab.models.Project;
import com.example.codeclan.EmployeeLab.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;


    @GetMapping(value = "/projects")
    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }

    @GetMapping(value = "/projects/{id}")
    public Optional<Project> getProject(@PathVariable Long id){
        return projectRepository.findById(id);
    }
}
