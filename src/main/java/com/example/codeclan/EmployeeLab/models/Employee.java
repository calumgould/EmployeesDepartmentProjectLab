package com.example.codeclan.EmployeeLab.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private int employeeNumber;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "projects_employees",
            joinColumns = {@JoinColumn(
                    name = "employee_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "project_id",
                    nullable = false,
                    updatable = false
            )}
    )
    private List<Project> projects;

    public Employee(String firstName, String lastName, int employeeNumber, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.department = department;
        this.projects = new ArrayList<>();
    }

    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public int getNumbersOfProjects(){
        return projects.size();
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addProject(Project project){
        this.projects.add(project);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
