package edu.jsp.custommethodsrepository.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.custommethodsrepository.bean.Employee;
import edu.jsp.custommethodsrepository.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeTestController {

	@Autowired
	private EmployeeRepository employeeRepository;

	// Endpoint to retrieve an Employee based on a specific condition
	@GetMapping("/getemp")
	public Employee getEmployee() {
		// Uncomment and choose one of the following methods to retrieve an Employee
		// based on specific criteria.

		// Example 1: Find an Employee by age
		// return employeeRepository.findByAge(30);

		// Example 2: Find a list of Employees with an age greater than 30
		// return employeeRepository.findByAgeGreaterThan(30);

		// Example 3: Find an Employee by email address
		// return employeeRepository.findByEmail("michael.clark@example.com");

		// Example 4: Find an Employee by name
		// return employeeRepository.findByName("Michael Clark");

		// Example 5: Find an Employee by password
		// return employeeRepository.findByPassword("securePass");

		// Example 6: Find an Employee by phone number
		// return employeeRepository.findByPhone(7777777777L);

		// Example 7: Find an Employee by phone number and password
		// return employeeRepository.findByPhoneAndPassword(7777777777L, "bob12345");

		return null; // You should return an Employee object or handle null accordingly.
	}

	// Endpoint to save a list of Employee objects
	@PostMapping("/save")
	public String saveEmployee(@RequestBody List<Employee> employees) {
		// Save each Employee in the list to the database
		for (Employee employee : employees) {
			employeeRepository.save(employee);
		}
		return "saved"; // A message indicating that the data has been saved.
	}
}
