package edu.jsp.simplebootdbapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.simplebootdbapp.entity.Student;
import edu.jsp.simplebootdbapp.entity.StudentRepository;

@RestController
public class StudentTestController {

	@Autowired
	private StudentRepository repository;

//	save student
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student student) {
		repository.save(student);
		return "saved";
	}

//	get all students
	@GetMapping("/getall")
	public List<Student> getAllStudent() {
		List<Student> students = repository.findAll();
		return students;
	}
	
//	get student by id
	@GetMapping("/getstd/{id}")
	public Student getStudent(@PathVariable int id) {
		Optional<Student> opt=repository.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			return null;
		}
	}
	
//	update student
	@PutMapping("update")
	public String updateStudent(@RequestBody Student student) {
		repository.save(student);
		return "Data updated";
	}
	
//	Delete Student
	@DeleteMapping("/remove/{sid}")
	public String deleteStudent(@PathVariable int sid) {
		Optional<Student> opt=repository.findById(sid);
		
		if (opt.isPresent()) {
			Student student=opt.get();
			repository.delete(student);
			return "Student deleted";
		} else {
			return "Student not found";
		}
	}
}
