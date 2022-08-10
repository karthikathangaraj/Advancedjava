package com.hidden;


import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
@WebServlet("/FirstServlet")
 
// this annotation is used for replacing xml file
public class FirstServlet extends HttpServlet {
 
    // class name is FirstServlet which extends HttpServlet
    public void doPost(HttpServletRequest request, HttpServletResponse response)
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
            String username = request.getParameter("userName");
 
            /*
             request.getParameter takes the value from index.html file where
             name is username
             */
            out.print("Welcome " + username);
 
            // out.println is used to print on the client web browser
 
            /*
             In the below code their is a hidden form
for maintaining session of user.
             this passes control to SecondServlet
             */
            out.print("<form action='SecondServlet'>");
 
            out.print("<input type='hidden' name='username' value='" + username + "'>");
            out.print("<input type='submit' value='submit'>");
            out.print("</form>");
            out.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}