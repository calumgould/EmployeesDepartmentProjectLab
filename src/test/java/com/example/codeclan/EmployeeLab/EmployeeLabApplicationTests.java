package com.example.codeclan.EmployeeLab;

import com.example.codeclan.EmployeeLab.models.Department;
import com.example.codeclan.EmployeeLab.models.Employee;
import com.example.codeclan.EmployeeLab.models.Project;
import com.example.codeclan.EmployeeLab.repositories.DepartmentRepository;
import com.example.codeclan.EmployeeLab.repositories.EmployeeRepository;
import com.example.codeclan.EmployeeLab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeLabApplicationTests {


	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canSaveEmployee(){
		Department frontEnd = new Department("Front End");
		departmentRepository.save(frontEnd);

		Project website = new Project("Facebook", 222);
		projectRepository.save(website);

		Employee john = new Employee("John", "Whatever", 123123, frontEnd);
		employeeRepository.save(john);

		frontEnd.addEmployee(john);
		departmentRepository.save(frontEnd);

		website.addEmployee(john);
		projectRepository.save(website);

	}




}
