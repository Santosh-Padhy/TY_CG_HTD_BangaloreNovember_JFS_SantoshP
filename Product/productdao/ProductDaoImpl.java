package com.capg.productdao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;


import com.capg.productbean.ProductData;

public class ProductDaoImpl implements ProductDao {
	Scanner sc = new Scanner(System.in);


	FileReader reader;
	Properties prop;
	ProductData con;
	public ProductDaoImpl() {
		try {
			reader= new FileReader("product.properties");
			prop= new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
			System.out.println("Driver loaded");
		} //end of try
		catch (Exception e) {

			e.printStackTrace();
		}//end of catch
	}//end of constructor
	@Override
	public List<ProductData> getAllProduct(String name) {
		List<ProductData> list=new ArrayList<ProductData>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement stmt=conn.prepareStatement("view");
				){
			//stmt.setString(1,name);
			ResultSet rs=stmt.executeQuery(prop.getProperty("view"));
			while (rs.next()) {
				long i = rs.getInt("productid");
				String s =rs.getString("productname");
				String r1  = rs.getString("productcolor");
				String s2 = rs.getString("description");
				
				System.out.println(i  + " productid"+ s +" productname"+ r1 +"  productcolor"+ s2 +"  description");
				//for adding data into the List we go for collection methods
				list.add(con);
			}
		}catch (Exception e) {
			e.printStackTrace();
		
		}
		return list;
		
	}		

	@Override
	public ProductData buyProduct(ProductData id) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword")))
				{	
					System.out.println("Enter the 16 didgit card no");
		 double  c1 =sc.nextDouble();
		 System.out.println("Enter 3 digit CVV no");
		 int cv= sc.nextInt();
		 if(c1<16&&cv<3) {
			 System.out.println("Please Enter the number Properly");
		 }else {
			System.out.println("You oredered Succefully");
		 }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return id;
	}

	@Override
	public ProductData SearchProduct(String name) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("search"))){
		
			pstmt.setString(1,name);
			ResultSet rs= pstmt.executeQuery(prop.getProperty("name"));
		
			while (rs.next()) {
				long i = rs.getInt("productid");
				String s =rs.getString("productname");
				String r1  = rs.getString("productcolor");
				String s2 = rs.getString("description");
				
				System.out.println(i  + " productid"+ s +" productname"+ r1 +"  productcolor"+ s2 +"  description");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		}
		
	
	
	
	
	
	
