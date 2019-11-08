package com.exampleone.springboot.assignmentone.controlers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.exampleone.springboot.assignmentone.controlers.DTO.Students;

@Service
public class Studentservice {
	private List<Students>students = Arrays.asList(
            new Students("Jesse", "Kiragu", "2002100", "Data Science"),
            new Students("Brandon", "Williams", "2002102", "Software Engineering"),
            new Students("Joe", "Henderson", "2002103", "Artificial Intelligence")
    );
	public List<Students> studentlist(){
		return students;
}
	public Students singlestudent(String idnum){
		for(Students stude: students){
			if(stude.getIdnum().equals(idnum)){
				return stude;
			}
		}
		return null;
	}
}
