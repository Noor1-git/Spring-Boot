package edu.jsp.atrequestmapping;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qspiders/employee")
public class AtRequestMappingDemo {

//	URL--> /qspiders/employee/save
	@PostMapping("/save")
	public String saveEmployee() {
		return null;
	}
	
	
	
	
//	URL--> /qspiders/employee/getall
	@GetMapping("/getall")
	public List<String> getAllEmployee(){
		return null;
	}
	
	
//	URL--> /qspiders/employee/get/10
	@GetMapping("/get/{eid}")
	public Object getEmployee() {
		return null;
	}
	
	
//	URL--> /qspiders/employee/delete/10
	@DeleteMapping("/delete/{eid}")
	public String deleteMapping() {
		return null;
	}
	
	
//	URL--> /qspiders/employee/update
	@PutMapping("update")
	public String updateEmployee() {
		return null;
	}
}