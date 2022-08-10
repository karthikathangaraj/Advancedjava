package Lti.finace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	Class.forName("com.mysql.jdbc.Driver"); 
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/lti","root","root");
		Statement st1=con.createStatement();
		ResultSet rs=st1.executeQuery("select * from stud");
		
		while(rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2)); 
			
		}
		con.close();
    }
}
