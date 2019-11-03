package com.exampleone.springboot.assignmentone;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentoneController {

	 @GetMapping("/students") 
	    public List<Students> studentslist(){  
		 return Arrays.asList(
				 new Students("Jesse", "Kiragu"),
				 new Students("Brandon", "Williams"),
				 new Students("Joe", "Henderson")
				 );
	
	 }
}
