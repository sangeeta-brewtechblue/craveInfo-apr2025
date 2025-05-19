package com.sj.model;

import java.util.Objects;

import com.sj.dao.LoginDAO;

public class Login {
	 String userName;
	 String password;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean isValid() throws ClassNotFoundException {
		
	    Login l= new LoginDAO().getCredentials(this.userName);		
		return l.equals(this);
		
		
	}
	
	
	
	
	
	public Login(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}







	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(password, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return Objects.equals(password, other.password) && Objects.equals(userName, other.userName);
	}
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", password=" + password + "]";
	}
	
	
	
	
	
	
	

}
