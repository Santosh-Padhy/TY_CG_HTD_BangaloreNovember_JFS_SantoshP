package com.capgemini.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.fms.bean.Client;
import com.capgemini.forestmanagementsystem.util.DBHelper;

public class ClientDaoImpl implements ClientDao  {
	static Connection connection = DBHelper.getConnection();
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;

	public Client addClient(int clientid, String clientname) {
		String addQuery = "INSERT  INTO client_info VALUES(?,?)";
		try {
			Client client = new Client();
			preparedStatement = connection.prepareStatement(addQuery);
			preparedStatement.setInt(1, clientid);
			preparedStatement.setString(2, clientname);
			preparedStatement.executeUpdate();
			return client;
		}catch(Exception e) {
			System.out.println("Data insertion is failed try again");
		}
		return null;
	}

	public boolean removeClient(int clientid) {
		String query = "DELETE FROM client_info WHERE clientid=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, clientid);
			int count = preparedStatement.executeUpdate();
			if(count>0)
				System.out.println("Data deleted Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public Client getClientinfo(int clientid) {
		Client client =new Client();
		String query = "SELECT * from client_info WHERE ID=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, clientid);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				client.setClientid(resultSet.getInt("clientid"));
				client.setClientname(resultSet.getString("clientname"));
				return client;
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return null;
	}


}
