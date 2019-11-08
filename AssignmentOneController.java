package com.exampleone.springboot.assignmentone.controlers;

import com.exampleone.springboot.assignmentone.controlers.DTO.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@GetMapping("/students/{idnum}")
public Students singlestudent(@PathVariable String idnum){
	return stservice.singlestudent(idnum);
	}
}
