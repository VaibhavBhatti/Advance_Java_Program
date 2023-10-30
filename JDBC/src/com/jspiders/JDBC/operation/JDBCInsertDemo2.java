  package com.jspiders.JDBC.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertDemo2 {

	public static void main(String[] args) throws SQLException {

		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);

		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/weja3?user=root&&password=root");

		Statement statement = connection.createStatement();

		statement.execute("insert into student values(4,'Alex','alex@gmail.com',26,25000)");

		System.out.println("Data inserted.");

		statement.close();
		connection.close();

		DriverManager.deregisterDriver(driver);

	}

}
