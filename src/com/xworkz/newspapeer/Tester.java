package com.xworkz.newspapeer;

import java.sql.*;
public class Tester {

	static String url="jdbc:mysql://localhost:3306/jdbc";
	static String username="root";
	static String password="deepa123";
	static String sqlStatement="insert into jdbc.newspaper values(3,'The Hindu','Hindi',40)";
	
	public static void main(String[] args) throws Exception {

		//Driver driver = Class.forName("com.xworkz.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println(connection+url);
		
		Statement statement=connection.createStatement();
		statement.executeUpdate(sqlStatement);
		 System.out.print("Query is executed");
	}

}
