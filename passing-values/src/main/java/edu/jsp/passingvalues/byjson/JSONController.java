package edu.jsp.passingvalues.byjson;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
public class JSONController {

	@PostMapping("/obj")
	public String getObj(@RequestBody Student student) {
		return student.toString();
	}
	
}
