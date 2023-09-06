package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentDeleteData {
	public static void main(String args[]) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="Mysql#12#";
		String query= "DELETE FROM student WHERE id=4";
		
		Connection connection = null;
		try {
			//register/load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish connection
			connection = DriverManager.getConnection(url,username,password);
			
			//establish statement
			Statement statement = connection.createStatement();
			
			//execute statement
			statement.execute(query);
			
			//close connection
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				 System.out.println("All Good");
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
	

}
}



