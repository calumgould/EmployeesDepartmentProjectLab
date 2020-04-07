package com.example.codeclan.EmployeeLab.repositories;

import com.example.codeclan.EmployeeLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
