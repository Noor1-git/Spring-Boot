package edu.jsp.response_structure.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.response_structure.bean.ResponseStructure;
import edu.jsp.response_structure.bean.Student;

@RestController
@RequestMapping("/student")
public class StudentTestController {

	@PostMapping("/save")
	public ResponseStructure<Student> saveStudent(@RequestBody Student student) {

		ResponseStructure<Student> structure = new ResponseStructure<Student>();

		structure.setStatus(200);
		structure.setMessage("Success");
		structure.setData(student);
		return structure;
	}
}