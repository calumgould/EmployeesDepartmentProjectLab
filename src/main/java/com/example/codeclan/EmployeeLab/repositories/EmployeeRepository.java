package com.example.codeclan.EmployeeLab.repositories;

import com.example.codeclan.EmployeeLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
