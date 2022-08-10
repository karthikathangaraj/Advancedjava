package com.genric;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ExampleGeneric extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter pwriter=res.getWriter();
		 pwriter.print("<html>");
		   pwriter.print("<body>");
		   pwriter.print("<h1> welcome to GENERIC SERVLET</h1>");
		   pwriter.print("</body>");
		   pwriter.print("</html>");
		   
		
		
	}

}
