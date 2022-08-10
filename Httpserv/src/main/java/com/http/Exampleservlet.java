package com.http;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Exampleservlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mymsg;
	public void init() throws ServletException 
    {      
       mymsg = "Http Servlet Demo";   
    }
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	    {    
		 res.setContentType("text/html");
		 PrintWriter out = res.getWriter(); 
		 out.println("<h1>" + mymsg + "</h1>"); 
		 out.println("<p>" + "Hello Friends!" + "</p>"); 
		 
	    }

}
