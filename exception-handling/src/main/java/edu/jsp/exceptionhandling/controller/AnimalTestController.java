package edu.jsp.exceptionhandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.exceptionhandling.bean.Animal;
import edu.jsp.exceptionhandling.bean.ResponseStructure;

@RestController
@RequestMapping("/animal")
public class AnimalTestController {

	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Animal>> saveAnimal(@RequestBody Animal animal){
		animal.setName(animal.getName()+" : "+animal.getName().length());
		
		ResponseStructure<Animal> structure=new ResponseStructure<>();
		structure.setStatus(HttpStatus.OK.value());
		structure.setMessage("Success");
		structure.setData(animal);
		
		return new ResponseEntity<ResponseStructure<Animal>>(structure,HttpStatus.OK);
	}
	
}
