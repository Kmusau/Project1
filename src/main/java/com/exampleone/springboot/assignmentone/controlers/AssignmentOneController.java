package com.exampleone.springboot.assignmentone.controlers;

import com.exampleone.springboot.assignmentone.DTO.Students;
import com.exampleone.springboot.assignmentone.services.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AssignmentOneController { 
	
@Autowired
private Studentservice stservice;

@GetMapping("v1/test")
public String testFunction(){
    return "Hello World";
}

@GetMapping("/students")
public List<Students> allstudents(){
    return stservice.studentlist();
	}

@GetMapping("/student/{idnum}")
public Students singlestudent(@PathVariable String idnum){
	return stservice.singlestudent(idnum);
	}

@PostMapping("/student/create")
public void addstudent(@RequestBody Students stu){
	stservice.addstudent(stu);
	}

@PutMapping("/student/{idnum}")
public void updatestudent(@RequestBody Students stu, @PathVariable String idnum){
	stservice.updatestudent(idnum, stu);
}

}
