package com.req;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Req extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res) 
			   throws ServletException,IOException 
			   {  
			     res.setContentType("text/html"); 
			     PrintWriter pwriter=res.getWriter(); 

			     String name = req.getParameter("uname");
			     String age = req.getParameter("uage");
			     pwriter.println("Name: "+name); 
			     pwriter.println("Age: "+age); 
			     pwriter.close(); 
			  }
			}

