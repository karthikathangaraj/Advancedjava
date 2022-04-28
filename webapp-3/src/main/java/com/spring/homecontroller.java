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
 public ModelAndView home(@RequestParam("name")String myname)
 {

	 ModelAndView mv=new ModelAndView();
	 mv.addObject("name",myname);
	 mv.setViewName("home");
	 return mv;
 
  
 }
}
