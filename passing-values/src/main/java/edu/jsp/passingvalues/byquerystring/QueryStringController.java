package edu.jsp.passingvalues.byquerystring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/querystring")
public class QueryStringController {

	@GetMapping("/getId")
	public String getUserId(@RequestParam int id) {
		return "Recieved id : " + id;
	}

	@GetMapping("/getInfo")
	public String getInfo(@RequestParam int id, @RequestParam long contact, @RequestParam String name) {
		return "Recieved : \n" + "Id : " + id + "\n" + "Contact : " + contact + "\n" + "Name : " + name;
	}
}

// URL --> http://localhost:8080/querystring/getInfo?id=10&contact=123456&name="Test"