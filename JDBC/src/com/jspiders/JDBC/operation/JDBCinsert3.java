package com.jspiders.JDBC.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCinsert3 {

	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);

	System.out.println("enter student id");
	 int id= scanner.nextInt();
	    scanner.nextLine();
	    System.out.println("enter student name");
	String name=scanner.nextLine();
	System.out.println("enter student email");
		
		String email=scanner.nextLine();
		System.out.println("enter student age");
		
		int age=scanner.nextInt();
		System.out.println("enter student fee");
		
		double fee=scanner.nextDouble();

				
	

		try {
			connection = openConnection();
			statement = connection.createStatement();
			query = "INSERT INTO student VALUES("+ id +",'" +name+ "' ,'"+email+" ',"+age +","+fee+")";
			int row = statement.executeUpdate(query);
			System.out.println(row + " row(s) affected.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static Connection openConnection() throws SQLException {

		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3", "root", "root");

	}

	private static void closeConnection() throws SQLException {

		if (statement != null) {
			statement.close();
		}
		if (connection != null) {
			connection.close();
		}
		DriverManager.deregisterDriver(driver);
	
	}

}