package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductUpdateData {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="Mysql#12#";
		
		String query="UPDATE product SET name='EFG' WHERE id=1";
		
		Connection connection=null;
		
		//Step1: Load/register Driver
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Step2:establish connection
			   connection= DriverManager.getConnection(url,username,password);
			  
			//Step3:establish/create statement
			   Statement statement=connection.createStatement();
			   
			//Step4:execute statement
			   statement.execute(query);	
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			try {
			connection.close();
			System.out.println("All good");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
}
