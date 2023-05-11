package com.dbOperation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DatabaseOperation{
	public static int insertData(String fname, String lname, String mail, String address, String mobnum) {
		Connection connection = com.dbConnection.DatabaseConnection.getConnection();
		String sql = "Insert into Details values('" + fname + "','" + lname + "','" + mail + "','" + address + "','"
				+ mobnum + "');";
		
		int i = 0;
		try {
			i = connection.createStatement().executeUpdate(sql);
			return i;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public static ResultSet showData(String fname) {
		Connection connection = com.dbConnection.DatabaseConnection.getConnection();
		
		try {
			ResultSet resultSet = connection.createStatement().executeQuery("Select * from Details where fname = '" +fname+ "';");
			return resultSet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
