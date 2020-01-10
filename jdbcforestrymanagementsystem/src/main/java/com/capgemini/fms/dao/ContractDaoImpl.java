package com.capgemini.fms.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.fms.bean.Client;
import com.capgemini.fms.bean.Contract;
import com.capgemini.forestmanagementsystem.util.DBHelper;

public class ContractDaoImpl implements ContractDao {
	static Connection connection = DBHelper.getConnection();
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	//Implementation Start 
	//Add the data to the database

	public Contract addContract(Contract contract) {
		String addQuery = "INSERT  INTO contract_info VALUES(?,?,?,?,?,?)";
		try {

			preparedStatement = connection.prepareStatement(addQuery);
			preparedStatement.setInt(1,contract.getContractno());
			preparedStatement.setLong(2,contract.getCustomerid());
			preparedStatement.setLong(3,contract.getProductid());
			preparedStatement.setLong(4,contract.getHaulierid());
			//preparedStatement.setString(5,contract.getDeliverydate());
			preparedStatement.setString(5,contract.getDeliveryday());
			preparedStatement.setInt(6,contract.getQuantity());
			preparedStatement.executeUpdate();
			return contract;
		}catch(Exception e) {
	       e.printStackTrace();
		}
		return null;
	}
	//Delete the data

	public boolean removeContract(int contractno) {
		String query = "DELETE from contract_info WHERE contractno=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, contractno);
			int count = preparedStatement.executeUpdate();
			if (count > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	//Get All data 
	public List<Contract> getContract(int contractno) {
		String query = "SELECT * from contract_info WHERE contractno=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, contractno);
			resultSet = preparedStatement.executeQuery();
			List<Contract> contractList = new ArrayList();
			while(resultSet.next()) {
				Contract contract = new Contract();
				contract.setContractno(resultSet.getInt("contractno"));
				contract.setCustomerid(resultSet.getInt("customerid"));
				contract.setProductid(resultSet.getInt("productid"));
				contract.setHaulierid(resultSet.getInt("haulierid"));
				//contract.setDeliverydate(resultSet.getString("deliverydate"));
				contract.setDeliveryday(resultSet.getString("deliveryday"));
				contract.setQuantity(resultSet.getInt("quantity"));
				contractList.add(contract);	
			}
			return contractList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	//contract data modify

	public boolean modifyContract(Contract contract) {
		int id = 0;
		String contractno="Select *form contract_info where contractno=?";
		String updatequery = "Update contract_info SET customerid=?,productid=?,haulierid=?,deliveryday=?,quantity=? WHERE contrctno=?";
		try {
			preparedStatement = connection.prepareStatement(contractno);
			preparedStatement.setInt(1, contract.getContractno());
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				id = resultSet.getInt("contractno");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		if(id > 0) {
			try {
				preparedStatement = connection.prepareStatement(updatequery);
				preparedStatement.setInt(1, contract.getContractno());
				preparedStatement.setInt(2, contract.getCustomerid());
				preparedStatement.setInt(3, contract.getProductid());
				preparedStatement.setInt(4,contract.getHaulierid());
			//	preparedStatement.setDate(5, (Date) contract.getDeliverydate());
				preparedStatement.setString(6,contract.getDeliveryday());
				preparedStatement.setInt(7, contract.getQuantity());
				preparedStatement.executeUpdate();
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
		return false;
	}	

}//end of class


