package com.capgemini.forestmanagementsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.capgemini.jdbcforestrymanagementsystem.common.ForestryManagementSystemDB;

public class DBHelper {
static Connection connection  = null;

static {
	try {
		Class.forName("com.mysql.jdbc.Driver");	
		connection=DriverManager.getConnection(ForestryManagementSystemDB.DB_URL,ForestryManagementSystemDB.DB_USERNAME,ForestryManagementSystemDB.DB_PASSWORD);
	}catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
}

public static Connection getConnection() {
	return connection;
}	
	
	
}

