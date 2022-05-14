package com.Eureka.studentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Eureka.studentservice.Model.student_info;
import com.Eureka.studentservice.repositry.studentrep;

@RestController 
@RequestMapping("/api/v1")
public class studentcontroller {
	
	@Autowired
	private studentrep sp;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/student")
	public List<student_info> getAllEmployee()
	{
		return sp.findAll();
	}
	
	
	//student api
	@PutMapping("/student")
  public student_info createstudent(@RequestBody student_info stud)
  {
	return sp.save(stud);
	
	 
  }
}
