package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class bookservices {
	
	private List<topics> topic=(List<topics>) Arrays.asList(new topics("tamil1",101),new topics("tamil1",102),new topics("tamil2",103));

	public List<topics> getbooks()
	{
		return topic;
	}

}
