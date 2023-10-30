package com.jspiders.JDBC.assigment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insert {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);
		connection =  openconnetion();
		  try {
			  connection = openconnetion();
			  query= "INSERT INTO person VALUES(?,?,?,?)";
			  preparedStatement = connection.prepareStatement(query);
		  
			  for(int i=1; i<=5;i++) {
				
				 System.out.println("enter the id ");
				int id=  scanner.nextInt();
				scanner.nextLine();
				  System.out.println(" enter the name");
				String name=  scanner.nextLine();
			    System.out.println("enter the email");
			    String email=scanner.nextLine();
			    System.out.println("enter the age");
			    int age=scanner.nextInt();
			  
			    
			   
					preparedStatement.setInt(1, id);
					preparedStatement.setString(2, name);
					preparedStatement.setString(3,email);
					preparedStatement.setInt(4, age);
					
					preparedStatement.addBatch();}
			  scanner.close();
					int [] res = preparedStatement.executeBatch();
					System.out.println(res.length + " row(s) affected.");
			  }
				 catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}

			 
			  
			  
			  
				}
		
		
	}

	private static Connection openconnetion() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3", "root", "root");
	}
	
	 private static void closeConnection() throws SQLException {
		  if(preparedStatement !=null) {
			 preparedStatement.close();
	  }
		  if (connection != null) {
				connection.close(); 
	
	
	
		  }	
	
	
	
	
	 }
}
