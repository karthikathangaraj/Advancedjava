package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createtable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/lti","root","root");
		Statement st1=con.createStatement();
		String mysql= "insert into emp values(101,'anupriya');"; 
		st1.executeUpdate("create table emptable(eid int(9),ename varchar(9));");
		st1.executeUpdate(mysql);

	}

}
