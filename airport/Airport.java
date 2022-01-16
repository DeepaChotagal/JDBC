package com.xworkz.airport;

import java.sql.*;
public class Airport {

	static String url="jdbc:mysql://localhost:3306/jdbc";
	static String username="root";
	static String password="deepa123";
	static String sqlStatement="insert into airport.airport_details values(5,'wipro','Bangalore',0,98000000,300,15000,9)";
	static String updateQuery = "update airport.airport_details set airport_Name='Bagdogra airport' where Id=3";
	static String updateQuery1 = "update airport.airport_details set airport_Name='Jaipur airport' where Id=6";
	static String deleteQuery = "delete from airport.airport_details where Id=2";


public static void main(String[] args) {
	
	Connection connection = null;
	try {

	connection  = DriverManager.getConnection(url, username, password);
	System.out.println(connection+url);
	
	Statement statement=connection.createStatement();
	statement.executeUpdate(updateQuery);
	statement.executeUpdate(updateQuery1);
	statement.executeUpdate(deleteQuery);
	 System.out.print("Query is executed");
	}
	catch(SQLException e)
	{
		System.out.println("query is not executed"+e.getMessage());
	}
	
	finally {
		
		try {
			if(connection!=null)
			{
				connection.close();
				System.out.println("connection is closed");
			}
		}
			catch(SQLException e) {
				
			}
			System.out.println("Query is executed");
			
		}
}
}