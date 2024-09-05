package javapackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL {

	public static void main(String[] args) throws Exception {
		
		// Create a Connection
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Project23","root","TASK23");
		
	    // Create a Statement/Query
		
		Statement stmt = con.createStatement();
		
		String S = "SELECT empno,ename,job from Empl";
		
		// Execute Statement / Query and Store Data in ResultSet
		
		ResultSet rs = stmt.executeQuery(S);
		
		while (rs.next()) {
			int empno = rs.getInt("EMPNO");
			String ename = rs.getString("NAME");
			String job = rs.getString("JOB");
			
			System.out.println(empno + " "+ ename+ " "+ job);
		}
		
	
		 // Close the Connection
		
		con.close();
		
		System.out.println("Query Executed Successfully");
		
	}
}
