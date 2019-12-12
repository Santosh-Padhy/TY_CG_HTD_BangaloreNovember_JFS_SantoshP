package com.capg.phonesimulatordaoImpl;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.capg.phonesimulatorbean.Contact;
import com.capg.phonesimulatordao.PhoneDao;

public class PhonedaoImpl implements PhoneDao {
Properties prop;
FileReader reader;
Contact con;

	public PhonedaoImpl() {
		try {
			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
			System.out.println("driver loaded with the help of constructor");
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
				int i = rs.getInt("number");
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
	public boolean editContact() {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
			    		prop.getProperty("dbPassword"));
			    PreparedStatement stmt=conn.prepareStatement(prop.getProperty("updatequery"))		
			    			
			    		){
			    	Scanner sc=new Scanner(System.in);
			    	stmt.setInt(2, userid);
			    	stmt.setString(3, password);
			    	System.out.println("Enter the new cont: ");
			    	stmt.setInt(2, sc.nextInt());
			    	
			    	int result=stmt.executeUpdate();
			    	if(result>0) {
			    		return true;
			    	}
			    	else {
			    		return false;
			    	}
			    	
			    }
				catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
						
				
				return false;
	
		
		return false;
	}

	@Override
	public boolean addContact() {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("insertQuery"))){

			pstmt.setInt(1, con.getContactno());
			pstmt.setString(2, con.getContactname());
		

			int count =pstmt.executeUpdate();

			if(count>0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public boolean searchContact() {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
	    		prop.getProperty("dbPassword"));
	    PreparedStatement stmt=conn.prepareStatement(prop.getProperty("deletequery"))	
	    		
	    		
	    		
	    		){
			stmt.setInt(1,userid);
			stmt.setInt(2,password);
			
	}

	@Override
	public boolean deleteContact() {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
	    		prop.getProperty("dbPassword"));
	    PreparedStatement stmt=conn.prepareStatement(prop.getProperty("deletequery"))		
	    			
	    		){
	    	
	    	stmt.setInt(1, userid);
	    	stmt.setString(2, password);
	    	
	    	int result=stmt.executeUpdate();
	    	if(result>0) {
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    	
	    }
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}
	
		
		return false;
	}


	
	
	
	
}
