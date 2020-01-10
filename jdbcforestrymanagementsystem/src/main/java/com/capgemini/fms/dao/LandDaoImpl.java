package com.capgemini.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.fms.bean.Land;
import com.capgemini.fms.bean.Product;
import com.capgemini.forestmanagementsystem.util.DBHelper;

public class LandDaoImpl implements LandDao {
	static Connection connection = DBHelper.getConnection();
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	public Land addLand(Land land) {
		String query = "INSERT INTO land_info Values(?,?)";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,land.getParcelId());
			preparedStatement.setString(2,land.getParcelLocation());
			preparedStatement.executeUpdate();
			return land;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean removeLand(int parcelId) {
		String query = "DELETE from land_info WHERE parcelId=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, parcelId);
			int count = preparedStatement.executeUpdate();
			if (count > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<Land> getLand(int parcelId) {
		String query = "SELECT * from land_info WHERE parcelId=?";	
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, parcelId);
			resultSet = preparedStatement.executeQuery();
			List<Land> landList = new ArrayList();
			while(resultSet.next()) {
				Land land = new Land();
				land.setParcelId(resultSet.getInt("parcelId"));
				land.setParcelLocation(resultSet.getString("parcelLocation"));
				landList.add(land);
			}
			return landList;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}



}//end of class
