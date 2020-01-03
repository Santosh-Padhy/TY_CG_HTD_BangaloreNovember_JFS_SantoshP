package com.capgemini.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;import com.capgemini.fms.bean.Product;
import com.capgemini.forestmanagementsystem.util.DBHelper;

public class ProductDaoImpl implements ProductDao{
	static Connection connection = DBHelper.getConnection();
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	//add product
	public Product addProduct(Product product) {
		String query = "INSERT INTO product_info Values(?,?)";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,product.getProductId());
			preparedStatement.setString(2, product.getProductName());
			return product;
		}catch(Exception e) {
			System.out.println("Data insertion failed");
		}
		return null;
	}

	//removing product
	public boolean removeProduct(int productId) {
		String query = "DELETE from product_info WHERE contractno=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, productId);
			int count = preparedStatement.executeUpdate();
			if (count > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	//Getting the product details
	public List<Product> getAllProduct(int productId) {
		String query = "SELECT * from product_info WHERE productId=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, productId);
			resultSet = preparedStatement.executeQuery();
			List<Product> productList = new ArrayList();
			while(resultSet.next()) {
				Product product = new Product();
				product.setProductId(resultSet.getInt("ProductId"));
				product.setProductName(resultSet.getString("ProductName"));
				productList.add(product);
			}
			return productList;

		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}