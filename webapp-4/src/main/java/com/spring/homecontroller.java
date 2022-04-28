package com.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homecontroller {
 
 @RequestMapping("home")
 public ModelAndView home(student s1)
 {

	 ModelAndView mv=new ModelAndView();
	 mv.addObject("obj",s1);
	 mv.setViewName("home");
	 return mv;
 
  
 }
}
