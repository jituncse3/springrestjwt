package com.nse.studentmicroservices;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentRest {

	
	@RequestMapping(value = "/echoStudentName/{name}")
    public String echoStudentName(@PathVariable(name = "name") String name) 
    {
        return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
    }
 
    @RequestMapping(value = "/getStudentDetails/{name}")
    public Student getStudentDetails(@PathVariable(name = "name") String name) 
    {
        return new Student(name, "Pune", "MCA");
    }
}
