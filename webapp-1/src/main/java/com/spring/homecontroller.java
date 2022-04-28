package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homecontroller {
 
 @RequestMapping("home")
 public String hello() {
	 System.out.println("hi");
	 return "home.jsp";
 
  
 }
}
