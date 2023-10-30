package com.jspiders.JDBC.assigment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class create {
  

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3?user=root&password=root");
         Statement statement = conn.createStatement();
      ) {		      
          String sql = "CREATE TABLE person " +
                   "(id INTEGER not NULL, " +
                   " name VARCHAR(255), " + 
                   " email VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARY KEY ( id ))"; 

         statement.executeUpdate(sql);
         System.out.println("Created table in given database...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
