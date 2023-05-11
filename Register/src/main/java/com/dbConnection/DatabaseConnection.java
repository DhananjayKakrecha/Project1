package com.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2", "root", "root");

			return connection;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
