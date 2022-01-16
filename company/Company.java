package com.xworkz.company;

import java.sql.*;
public class Company {

	static String url="jdbc:mysql://localhost:3306/jdbc";
	static String username="root";
	static String password="deepa123";
	static String sqlStatement="insert into COMPANY.company values(5,'wipro','Bangalore',0,98000000,300,15000,9)";
	static String updateQuery = "update COMPANY.company set Company_Name='HCL' where Company_Id=3";
	static String deleteQuery = "delete from COMPANY.company where Company_Id=2";
	
			public static void main(String[] args) {
				
				Connection connection = null;
				try {
		
				connection  = DriverManager.getConnection(url, username, password);
				System.out.println(connection+url);
				
				Statement statement=connection.createStatement();
				statement.executeUpdate(updateQuery);
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


				
			
	


