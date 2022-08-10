package com.application;
import java.io.*;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class App  implements Servlet {

	 ServletConfig config=null;

	@Override
	public void destroy() {
		System.out.println("servlet life cycle finished");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		
		return "A Demo program written by karthika";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		 this.config=config;
		 System.out.println("Initialization complete");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h1>welcome to servlet</h1>");
		pw.print("</body>");
		pw.print("</html>");
		
	}

}
