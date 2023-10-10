package edu.jsp.customquerymethodsrepository.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.customquerymethodsrepository.bean.User;
import edu.jsp.customquerymethodsrepository.bean.UserRepository;

@RestController
@RequestMapping("/user")
public class UserTestController {
	
	@Autowired
	private UserRepository repository;
	
	
	@GetMapping("/getuser")
	public List<User> getUser() {
		List<User> list=new ArrayList<>();
		for (User user : repository.getByStatus("active")) {
			list.add(user);
		}
		return list;
	}

	@PostMapping("/save")
	public String saveEmployee(@RequestBody List<User> users) {
		
		for (User user : users) {
		repository.save(user);
		}
		return "saved";
	}
	
}
