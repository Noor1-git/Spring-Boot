package edu.jsp.responseentity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.responseentity.bean.Employee;
import edu.jsp.responseentity.bean.ResponseStructure;

@RestController
@RequestMapping("/employee")
public class EmployeeTestController {

	@GetMapping("/getemp/{eid}")
	public ResponseEntity<ResponseStructure<Employee>> getEmployee(@PathVariable int eid) {
		if (eid == 1) {
			Employee employee = new Employee();
			employee.setEid(1);
			employee.setName("test");
			employee.setEmail("test@mail.com");

			ResponseStructure<Employee> structure = new ResponseStructure<>();
			structure.setStatus(200);
			structure.setMessage("Success");
			structure.setData(employee);

			ResponseEntity<ResponseStructure<Employee>> entity = new ResponseEntity<ResponseStructure<Employee>>(
					structure, HttpStatus.OK);

			return entity;
		} else {

			ResponseStructure<Employee> structure = new ResponseStructure<>();
			structure.setStatus(404);
			structure.setMessage("Not Found");
			structure.setData(null);

			ResponseEntity<ResponseStructure<Employee>> entity = new ResponseEntity<ResponseStructure<Employee>>(
					structure, HttpStatus.NOT_FOUND);

			return entity;
		}
	}

}
