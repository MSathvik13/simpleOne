package com.waleed.training;

public class User {

	Integer userId;
	String userName;
	String userLocation;

	public Integer getUserId() {
		return userId;
	}

	public User(Integer userId, String userName, String userLocation) {
		this.userId = userId;
		this.userName = userName;
		this.userLocation = userLocation;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

}
