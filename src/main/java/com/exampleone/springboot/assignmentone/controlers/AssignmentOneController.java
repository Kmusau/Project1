package com.exampleone.springboot.assignmentone.controlers;

import com.exampleone.springboot.assignmentone.controlers.DTO.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sylvester
 * Project proj
 * User: sylvester
 * Date: 10/28/19
 * Time: 10:54 AM
 */
@RestController
public class AssignmentOneController {
    @GetMapping("v1/test")
    public String testFunction(){
        return "Hello World";
    }

    @GetMapping("/students")
    public List<Students> studentslist(){
        return Arrays.asList(
                new Students("Jesse", "Kiragu"),
                new Students("Brandon", "Williams"),
                new Students("Joe", "Henderson")
        );

    }
}
