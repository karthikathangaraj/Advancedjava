package com.hidden;

import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// using this annotation we dont need
// xml file for dispathing servlet
@WebServlet("/SecondServlet")
 
public class SecondServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        try {
            response.setContentType("text/html");
            /*
             The response's character encoding is only set from the given
             content type if this method is called before getWriter is called.
             This method may be called repeatedly to change content type and
             character encoding.
             */
            PrintWriter out = response.getWriter();
 
            /*
             The Java PrintWriter class ( java.io.PrintWriter ) enables you to
             write formatted data to an underlying Writer . For instance,
             writing int, long and other primitive data formatted as text,
             rather than as their byte values
             */
            // getting value from the query string
            String username = request.getParameter("username");
 
            // taking the value of usename from First servlet using getparameter object
            out.print("WELCOME " + username);
 
            // out.println is used to print on the client web browser
            out.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}