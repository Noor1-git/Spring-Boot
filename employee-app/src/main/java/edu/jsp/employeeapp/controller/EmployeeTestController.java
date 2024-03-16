package edu.jsp.employeeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.employeeapp.dto.ResponseStructure;
import edu.jsp.employeeapp.entity.Employee;
import edu.jsp.employeeapp.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class EmployeeTestController {

	@Autowired
	private EmployeeService service;

	@Operation(description = "create emp object save in database", summary = "save emp")
	@ApiResponses(value = { @ApiResponse(description = "emp object", responseCode = "201"), @ApiResponse(description = "fail",responseCode = "406")})
	@PostMapping("/employees")
	public ResponseEntity<ResponseStructure<Employee>> saveEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<ResponseStructure<Employee>> getEmployee(@PathVariable int id) {
		return service.getEmployeeById(id);
	}

}