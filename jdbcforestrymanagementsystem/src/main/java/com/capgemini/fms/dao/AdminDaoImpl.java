package com.capgemini.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.fms.bean.Admin;
import com.capgemini.forestmanagementsystem.util.DBHelper;

public class AdminDaoImpl implements AdminDao {
	static Connection connection = DBHelper.getConnection();
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	Admin admin ;
	List<Admin> adminoutput = new ArrayList<Admin>();
	public List< Admin> login(String username, String password) {
		String 	checkquery = "SELECT * FROM login_details WHERE username=?,password= ?,usertype= admin";	
		try {
			preparedStatement= connection.prepareStatement(checkquery);
			preparedStatement.setString(1, username);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				admin = new Admin();
				admin.setUsername(resultSet.getString(username));
				admin.setPassword(resultSet.getString(password));
				adminoutput.add(admin);
			}
			return adminoutput;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public boolean addlogindetails(String username, String password) {
		String addquery = "INSERT INTO login_details Values(?,?)";
		try {
			preparedStatement = connection.prepareStatement(addquery);
			preparedStatement.setString(1,admin.getUsername());
			preparedStatement.setString(1,admin.getPassword());
			preparedStatement.executeUpdate();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;


	}
}