package edu.jsp.mappingannotations.producesandconsumes;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestProducesAndConsumesController {
	
//data has to be sent in xml format
//	<Student>
//    <id>1</id>
//    <name>test</name>
//    <email>test@mail.com</email>
//    </Student>
	
	@GetMapping(value="/get",produces = MediaType.APPLICATION_XML_VALUE)
	public Student getStudent() {
		Student student=new Student();
		student.setId(1);
		student.setName("test");
		student.setEmail("test@mail.com");
		return student;
	}
	
	
//	will accept data in xml format and return data in xml format.
	@PostMapping(value="/save",consumes = MediaType.APPLICATION_XML_VALUE,produces = MediaType.APPLICATION_XML_VALUE)
	public Student saveStudent(@RequestBody Student student) {
		return student;
	}
	
//	accepts data in xml format and returns data in json format
	@PutMapping(value="/update",consumes=MediaType.APPLICATION_XML_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Student updateStudent(@RequestBody Student student) {
		return student;
	}
	
}