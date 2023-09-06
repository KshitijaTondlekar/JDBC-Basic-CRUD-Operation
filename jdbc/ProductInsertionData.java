package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class ProductInsertionData {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="Mysql#12#";
		String query="INSERT INTO product VALUES(3,'abc',300)";
		
		Connection connection=null;
		//step1:Load/register the Driver 
		
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	
	  //step2:establish connection
	  
		connection=DriverManager.getConnection(url,username,password);
	
	  //step3:establish/create statement
	      Statement statement =connection.createStatement();
	      
	      //step4:excute statement
	      statement.execute(query);
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(SQLException e) {
		e.printStackTrace();
		//step5:close connection
	}finally {
		try {
			connection.close();
		   System.out.println("All Good");
		}catch(SQLException e) {
			e.getStackTrace();
		}
	}

	}
}
