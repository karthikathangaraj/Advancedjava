package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.topics;
//get request
@RestController
public class hellocontroller {
	
	@RequestMapping("/books")
	public List<topics> Listofbooks()
	{
		
		return Arrays.asList(new topics("tamil1",101),new topics("tamil1",102),new topics("tamil2",103), new topics("english",011234));
			//return Arrays.asList(new topics());
		//return "books";
		
	}

}
