package com.jspiders.JDBC.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.Callable;

import com.mysql.cj.jdbc.CallableStatement;
import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

public class JDBCCall {
	private static Connection connection;
	private static java.sql.CallableStatement callableStatement;
	private static ResultSet resultSet;
	private static String query;
	
	
	public static void main(String[] args) {
	try {
		connection =openConnection();
		query = "call p1()";
		callableStatement = connection.prepareCall(query);
		callableStatement.execute();
		resultSet= callableStatement.getResultSet();
		
		
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getInt(4));
			System.out.println(resultSet.getDouble(5));
			}
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
	
private static Connection openConnection() throws ClassNotFoundException, SQLException {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3", "root", "root");
	  
}
private static void closeConnection() throws SQLException {
	  if( resultSet!=null) {
		 resultSet.close();
}
	  if(callableStatement != null) {
		  callableStatement.close();
	  }
	  if (connection != null) {
			connection.close(); 
			
	  }}}
	


