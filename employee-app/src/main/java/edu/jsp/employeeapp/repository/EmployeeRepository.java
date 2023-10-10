package edu.jsp.employeeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.employeeapp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
