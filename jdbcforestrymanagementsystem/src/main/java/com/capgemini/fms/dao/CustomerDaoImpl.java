package com.capgemini.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.fms.bean.Customer;
import com.capgemini.forestmanagementsystem.util.DBHelper;

public class CustomerDaoImpl implements CustomerDao {
	static Connection connection = DBHelper.getConnection();
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	
	public Customer addCustomer(Customer customer) {
		String addquery = "INSERT INTO customer_info Values(?,?,?,?,?,?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(addquery);
			preparedStatement.setInt(1, customer.getCustomerid());
			preparedStatement.setString(2,customer.getCustomerName());
			preparedStatement.setString(3,customer.getStreetAddress1());
			preparedStatement.setString(4,customer.getStreetAddress2());
			preparedStatement.setInt(5,customer.getPostalCode());
			preparedStatement.setLong(6,customer.getTelephoneNumber());
			preparedStatement.setString(7, customer.getEmail());
			preparedStatement.setString(8,customer.getTown());
			preparedStatement.executeUpdate();
			return customer;

		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean removeCustomer(int customerid) {
		String query = "DELETE from customer_info WHERE customer_id=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, customerid);
			int count = preparedStatement.executeUpdate();
			if (count > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<Customer> getCustomerinfo(int customerid) {
		String query = "SELECT * from customer_info WHERE customer_id=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, customerid);
			resultSet = preparedStatement.executeQuery();
			List<Customer> customerList = new ArrayList();
			while(resultSet.next()) {
				Customer customer = new Customer();
				customer.setCustomerid(resultSet.getInt("customerid"));
				customer.setCustomerName(resultSet.getString("customerName"));
				customer.setStreetAddress1(resultSet.getString("streetAddress1"));
				customer.setStreetAddress2(resultSet.getString("streetAddress2"));
				customer.setTown(resultSet.getString("town"));
				customer.setEmail(resultSet.getString("email"));
				customer.setPostalCode(resultSet.getInt("postalcode"));
				customer.setTelephoneNumber(resultSet.getLong("telephoneNumber"));
				customerList.add(customer);
			}
			return customerList;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean modifyCustomer(Customer customer) {
		int id = 0;
		String customerid="Select *form customer_info where customer_id=?";
		String updatequery = "Update customer_info SET customerid=?,customerName=?,streetAddress1=?,StreetAddress2=?,"
				+ "town=?,email=?,postalcode=?,telephoneNumber=? WHERE customer_id=?";
		try {
			preparedStatement = connection.prepareStatement(customerid);
			preparedStatement.setInt(1, customer.getCustomerid());
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				id = resultSet.getInt("customer_id");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		if(id > 0) {
			try {
				preparedStatement = connection.prepareStatement(updatequery);
				preparedStatement.setInt(1, customer.getCustomerid());
				preparedStatement.setString(2, customer.getCustomerName());
				preparedStatement.setString(3, customer.getStreetAddress1());
				preparedStatement.setString(4,customer.getStreetAddress2());
				preparedStatement.setInt(5, customer.getPostalCode());
				preparedStatement.setString(6,customer.getTown());
				preparedStatement.setString(7, customer.getEmail());
				preparedStatement.setLong(7, customer.getTelephoneNumber());
				preparedStatement.executeUpdate();
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
		return false;
	}

}
