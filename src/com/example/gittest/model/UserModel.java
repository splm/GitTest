package com.example.gittest.model;


public class UserModel implements Cloneable {
	
	private String username;
	
	private String usersex;
	
	private String usertype;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsersex() {
		return usersex;
	}

	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		UserModel userModel=(UserModel) super.clone();
		
		return userModel;
	
	}
	
}
