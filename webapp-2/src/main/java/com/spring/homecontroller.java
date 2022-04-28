package com.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homecontroller {
 
 @RequestMapping("home")
 public String home(HttpServletRequest req) {
	 
	 HttpSession sec=req.getSession();
	 String name=req.getParameter("name");
	 System.out.println("hi "+name);
	 sec.setAttribute("name", name);
	 return "home";
 
  
 }
}
