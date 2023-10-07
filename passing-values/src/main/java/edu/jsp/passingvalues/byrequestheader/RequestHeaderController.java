package edu.jsp.passingvalues.byrequestheader;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requestheader")
public class RequestHeaderController {

	@GetMapping("/info")
	public String getInfo(@RequestHeader String token) {
		return "Token : " + token;
	}

	@GetMapping("/studentinfo")
	public String getStudentInfo(@RequestHeader String name, @RequestHeader String email) {
		return "Name : " + name + "\nEmail : " + email;
	}

}
