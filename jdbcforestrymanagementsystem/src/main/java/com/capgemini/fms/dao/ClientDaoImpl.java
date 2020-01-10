package com.capgemini.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.fms.bean.Client;
import com.capgemini.fms.exception.CustomException;
import com.capgemini.forestmanagementsystem.util.DBHelper;

public class ClientDaoImpl implements ClientDao  {
	static Connection connection = DBHelper.getConnection();
	PreparedStatement preparedStatement=null;
	ResultSet resultSet =null;
	Client client;
	public boolean addClient(int clientid, String clientname) {
		String addQuery ="INSERT INTO client_info VALUES (?,?)";
		client = new Client();
		try {
			preparedStatement = connection.prepareStatement(addQuery);
			preparedStatement.setInt(1, clientid);
			preparedStatement.setString(2, clientname);
			preparedStatement.executeUpdate();
			return true;
		}catch(Exception e) {
			throw new CustomException("Data is not inserted");
			
		}

	}

	public boolean removeClient(int clientid) {
		String query = "DELETE FROM client_info WHERE client_id=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, clientid);
			int count = preparedStatement.executeUpdate();
			if(count>0)
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new CustomException("Daat is Not Deleted");
		}

		return false;
	}

	public List<Client> getClientinfo(int clientid) {
		List<Client> clientlist = new ArrayList<Client>();
		String query  = "SELECT * FROM client_info WHERE client_id =?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, clientid);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				client =new Client();
				client.setClientid(resultSet.getInt(1));
				client.setClientname(resultSet.getString(2));
				clientlist.add(client);
			}
			return clientlist;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
