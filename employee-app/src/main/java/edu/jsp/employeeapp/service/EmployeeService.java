package edu.jsp.employeeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import edu.jsp.employeeapp.dao.EmployeeDao;
import edu.jsp.employeeapp.dto.ResponseStructure;
import edu.jsp.employeeapp.entity.Employee;
import edu.jsp.employeeapp.exception.IdDoesNotFoundException;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;

	public ResponseEntity<ResponseStructure<Employee>> saveEmployee(Employee employee) {

		Employee recieved = dao.saveEmployee(employee);
		ResponseStructure<Employee> structure = new ResponseStructure<>();
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setMessage("success");
		structure.setData(recieved);

		return new ResponseEntity<ResponseStructure<Employee>>(structure, HttpStatus.CREATED);
	}

	public ResponseEntity<ResponseStructure<Employee>> getEmployeeById(int id) {
		Employee employee = dao.getEmployeeById(id);
		if (employee != null) {
			ResponseStructure<Employee> structure = new ResponseStructure<>();
			structure.setStatus(HttpStatus.OK.value());
			structure.setMessage("success");
			structure.setData(employee);
			return new ResponseEntity<ResponseStructure<Employee>>(structure, HttpStatus.OK);
		} else {
			throw new IdDoesNotFoundException("Id " + id + " is not Present");
		}
	}
}