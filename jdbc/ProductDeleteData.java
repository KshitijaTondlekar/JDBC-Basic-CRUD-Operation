package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDeleteData {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="Mysql#12#";
		
		String sql="DELETE FROM product WHERE id=3";
		
		Connection connection = null;
		
		//Step 1:Load/register Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		//Step 2:establish connection
			
				connection=DriverManager.getConnection(url,username,password);
			
		//Step 3:establish / create statement
			
				Statement statement = connection.createStatement();
			
			
		//Step 4: execute statement
		
				statement.execute(sql);
			 
		//Step 5:close connection
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				System.out.println("All done");
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

}
