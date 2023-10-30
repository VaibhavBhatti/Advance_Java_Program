package com.jspiders.JDBC.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCInsert {
	public static void main(String[] args)throws SQLException {
		//Register Driver
		
		Driver driver = new com.mysql.cj.jdbc.Driver();
		 
		DriverManager.registerDriver(driver);
		
		
		//open connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3?user=root&password=root");
	
		//System.out.println("scueess");
		
		//create Statement
		Statement statement = connection.createStatement();
		
		//execute statement
		statement.execute("INSERT INTO student VALUES(3,'Ram','ram@gmail.com',24,200000)");
 
		//Process Result
		System.out.println("Data inserted");
	
		//close connection
		statement.close();
		connection.close();
		
		//Dergister Dirver
		
		DriverManager.deregisterDriver(driver);
		
		  
      
		  
		  
	}

}
