package edu.jsp.mappingannotations;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@GetMapping("/getMethod")
	public String getMapping() {
		return "Get Mapping Method";
	}
	
	@PostMapping("/postMethod")
	public String postMapping() {
		return "Post Mapping Method";
	}
	
	@PutMapping("/putMethod")
	public String putMapping() {
		return "Put Mapping Method";
	}
	
	@DeleteMapping("/deleteMethod")
	public String deleteMapping() {
		return "Delete Mapping Method";
	}
}
