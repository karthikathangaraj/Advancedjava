package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
	
	@RequestMapping("index")
	public String display()
	{
		return "index.jsp";
	}

}
