package com.sj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sj.model.Login;

public class LoginDAO {
    Connection connection;
	PreparedStatement pst;
	
	public LoginDAO() throws ClassNotFoundException {
		super();
		// TODO Auto-generated constructor stub
		try {
			 System.out.println("in constr");
			 Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/craveinfo","root","root");
		    
		    System.out.println("driver"+connection);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
     public Login getCredentials(String userName) {
	          try {
	        	    pst = connection.prepareStatement("select password from login where username = ?");
					pst.setString(1, userName);
				    ResultSet rs =	pst.executeQuery();
					rs.next();
					String password = rs.getString(1);
					Login dbLogin = new Login(userName,password);
					return dbLogin;
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            return null;
	   
     }
	
	
	
	

}
