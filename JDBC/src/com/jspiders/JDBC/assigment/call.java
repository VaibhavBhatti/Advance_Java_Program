package com.jspiders.JDBC.assigment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;



public class call {
	
  private static Connection connection;
  private static ResultSet resultSet;
  private static CallableStatement callableStatement;
  private static String query;
  public static void main(String[] args) {

	  try {
		connection = openconnection();
		query="call P1()";
		callableStatement =connection.prepareCall(query);
		callableStatement.execute();
		resultSet= callableStatement.getResultSet();
		while(resultSet.next()) {
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
		System.out.println(resultSet.getString(3));
		System.out.println(resultSet.getInt(4));
		System.out.println(resultSet.getDouble(5));
		}
		
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	  
}
private static Connection openconnection() throws ClassNotFoundException, SQLException {
	
Class.forName("com.mysql.cj.jdbc.Driver");	

	return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3","root","root");
}
private static void closeConnection() throws SQLException {
	if(callableStatement != null) {
		callableStatement.close();
	}
	if(resultSet != null) {
		resultSet.close();
	}
	if(connection !=null) {
		connection.close();
	}
	
}
  
  
  
  
  
  
  
  
  
  
  
	}
	


