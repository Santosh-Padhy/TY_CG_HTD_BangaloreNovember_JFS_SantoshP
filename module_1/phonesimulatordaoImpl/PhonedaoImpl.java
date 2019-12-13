package com.capg.phonesimulatordaoImpl;

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

import com.capg.phonesimulatorbean.Contact;
import com.capg.phonesimulatordao.PhoneDao;
import com.capg.phonesimulatorfactory.PhoneFactory;

import java.sql.*;
public class PhonedaoImpl implements PhoneDao {
	Properties prop;
	FileReader reader;
	Contact con;
	Statement stmt;

	Contact cont = PhoneFactory.getContact();

	public PhonedaoImpl() {

		try {
			reader=new FileReader("config.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
			System.out.println("driver loaded ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> list=new ArrayList<Contact>();

		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("All"))){
			while (rs.next()) {
				long i = rs.getLong("number");
				String s =rs.getString("name");
				System.out.println(i+"Contact number"+s+"Name");
				//for adding data into the List we go for collection methods
				list.add(con);
			}
			return list;

		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	@Override
	public boolean editContact(String name) {

		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("updatequery"))){
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter the new cont: ");
			pstmt.setInt(2, sc.nextInt());

			int count = pstmt.executeUpdate();



		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}


		return false;
	}	

	@Override
	public boolean addContact(Contact con) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("insertQuery"))){

			pstmt.setLong(1, con.getContactno());
			pstmt.setString(2, con.getContactname());
			int count =pstmt.executeUpdate();
			//System.out.println("Data inseretd sucessfully");


		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}
	@Override
	public boolean searchContact(String name) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("search"))){

			pstmt.setString(1,name);

			ResultSet result =pstmt.executeQuery();
			while(result.next())
			{

				System.out.println("Name : "+result.getString(1));
				System.out.println("Number : "+result.getInt(2));
				System.out.println("Groups : "+result.getString(3));


			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public boolean deleteContact(String name) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("delete"))){
			pstmt.setString( 1, name);
			int count =pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return false;

	}






}
