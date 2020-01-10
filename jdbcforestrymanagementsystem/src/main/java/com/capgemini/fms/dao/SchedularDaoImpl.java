package com.capgemini.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.fms.bean.Client;
import com.capgemini.fms.bean.Schedular;
import com.capgemini.forestmanagementsystem.util.DBHelper;

public class SchedularDaoImpl implements SchedularDao {
	static Connection connection = DBHelper.getConnection();
	PreparedStatement preparedStatement=null;
	ResultSet resultSet =null;
	Schedular schedular;
	@Override
	public boolean addData(Schedular schedular) {
		String addQuery ="INSERT INTO schedular_info VALUES (?,?,?,?)";
		try {
			schedular = new Schedular();
			preparedStatement = connection.prepareStatement(addQuery);
			preparedStatement.setInt(1,schedular.getSchedularid());
			preparedStatement.setString(2,schedular.getDate());
			preparedStatement.setInt(3,schedular.getProductid());
			preparedStatement.setInt(4,schedular.getQuantity());
			preparedStatement.executeUpdate();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}	
		return false;
	}

	@Override
	public boolean removeData(int schedularid) {
		String query = "DELETE FROM schedular_info WHERE schedularid=?";
		try {
			schedular=new Schedular();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,schedularid);
			int count = preparedStatement.executeUpdate();
			if(count>0)
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<Schedular> getAllData(int schedularid) {
		List<Schedular> schedularlist = new ArrayList<Schedular>();
		String query  = "SELECT * FROM schedular_info WHERE schedularid =?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, schedularid);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				schedular =new Schedular();
				schedular.setSchedularid(resultSet.getInt(1));
				schedular.setDate(resultSet.getString(2));
				schedular.setProductid(resultSet.getInt(3));
				schedular.setQuantity(resultSet.getInt(4));
				schedularlist.add(schedular);
			}
			return schedularlist;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

}
}
