package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//get request
@RestController
public class hellocontroller {
	
	@Autowired
	private bookservices bookservices;
	
	@RequestMapping("/books")
	public List<topics> Listofbooks()
	{
		return bookservices.getbooks();
	}

}
