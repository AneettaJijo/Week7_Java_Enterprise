package com.example.demo;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    
    	 public Student create() {
    	        Student s1 = new Student();
    	        s1.setStudentID(1);
    	        s1.setFname("Evin");
    	        s1.setLname("Jijo");
    	        s1.setPhone("123-456-7890");
    	        s1.setDob("2002-08-15");

    	        Address addr = new Address();
    	        addr.setNo("4189");
    	        addr.setStreet("Brandon Gate Dr");
    	        addr.setCity("Mississauga");

    	        s1.setAddress(addr);
    	        return s1;
    	    }
}