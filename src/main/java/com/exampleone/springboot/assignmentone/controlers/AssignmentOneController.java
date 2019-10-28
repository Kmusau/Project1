package com.exampleone.springboot.assignmentone.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sylvester
 * Project proj
 * User: sylvester
 * Date: 10/28/19
 * Time: 10:54 AM
 */
@RestController //This annotation helps to creat a restful controller
public class AssignmentOneController {
    @GetMapping("v1/test") // This exposes an endpoint "/v1/test"
    public String testFunction(){ // This is the function called when the endpoint is invoke. It has a return type string. That means it can only return a string on invokation
        return "Hello World"; // This is what is being returned on invoking the method. You can return any string you want
    }
}
