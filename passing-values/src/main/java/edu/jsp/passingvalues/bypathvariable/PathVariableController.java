package edu.jsp.passingvalues.bypathvariable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pathvariable")
public class PathVariableController {

	
//	URL-->http://localhost:8080/pathvariable/profile/10
	@GetMapping("/profile/{id}")
	public String proInfo(@PathVariable int id) {
		return "Id is : "+id;
	}
	
	
//	URL-->http://localhost:8080/pathvariable/group/my_Grp
	@GetMapping("/group/{grpName}")
	public String grpInfo(@PathVariable(name="grpName") String gn) {
		return "Group name : "+gn;
	}
	
	
//	URL -->http://localhost:8080/pathvariable/school/10/student/101
	@GetMapping("/school/{id}/student/{sid}")
	public String schoolInfo(@PathVariable int id,@PathVariable int sid) {
		return "School id : "+id+" Student Id : "+sid;
	}
	
}
