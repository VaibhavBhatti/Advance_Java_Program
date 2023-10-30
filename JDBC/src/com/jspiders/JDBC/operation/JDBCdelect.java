package com.jspiders.JDBC.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCdelect{

	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;

	public static void main(String[] args) {

		try {
			connection = openConnection();
			statement = connection.createStatement();
			
			//query = "update student "
				//	+ "set email = 'amar123@gmail.com' "
					//+ "where id = 1";
			query = "delete from student "
			+ "where id = 9";
			//query = "INSERT INTO student VALUES(6,'Umesh','umesh@gmail.com',26,30000)";
			int row = statement.executeUpdate(query);
			System.out.println(row + " row(s) affected.");
			System.out.println(" delect the sucessfully row..!");
			
			
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