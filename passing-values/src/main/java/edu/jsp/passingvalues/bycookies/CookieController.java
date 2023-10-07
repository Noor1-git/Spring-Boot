package edu.jsp.passingvalues.bycookies;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/cookie")
public class CookieController {

//	-------------------------sending cookie using postman---------------------------------------------
	@GetMapping("/data")
	public String getCookie(@CookieValue String name) {
		return "Name is "+name;
	}
	
	
	@GetMapping("/details")
	public String getDetails(@CookieValue String name,@CookieValue String email) {
		return "Name : "+name+"\nEmail : "+email;
	}
//	-------------------------sending cookie using postman---------------------------------------------	
	
	
	
//	=====================manually sending cookie using response object=================================
	
	@GetMapping("/setdata")
	public String setAge(HttpServletResponse response) {
		Cookie cookie=new Cookie("age", "10");
		response.addCookie(cookie);
		return "added";
	}
	
	
	@GetMapping("/getdata")
	public String getAge(@CookieValue int age) {
		return "Age is : "+age;
	}
//	=====================manually sending data using response object=================================	
}