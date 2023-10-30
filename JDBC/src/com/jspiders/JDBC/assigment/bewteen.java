package com.jspiders.JDBC.assigment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

   public class bewteen {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query;
	
public static void main(String[] args) {

	
	try {
		connection = openconnection();
		query="SELECT * FROM person WHERE AGE BETWEEN 10 AND 30; ";
		preparedStatement= connection.prepareStatement(query);
		
		resultSet = preparedStatement.executeQuery();

		
		while(resultSet.next()) {
	      System.out.println(resultSet.getInt(1));
	      System.out.println(resultSet.getString(2));
	      System.out.println(resultSet.getString(3));
	      System.out.println(resultSet.getInt(4));
	     
		}
		
	}
	catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	finally {
		
		try {
	closeconnection();
	}
	catch(SQLException e) {
	e.printStackTrace();
			}}

	

}
	private static Connection  openconnection() throws ClassNotFoundException,SQLException{
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	return DriverManager.getConnection("jdbc:mysql://localhost:3306 /weja3","root","root");
	
}
private static void closeconnection()throws SQLException{
	if(resultSet !=null) {
		resultSet.close();
		
	}
	if(preparedStatement !=null) { 
		preparedStatement.close();
	}
	if(connection !=null) {
		connection.close();
	}
}

}
