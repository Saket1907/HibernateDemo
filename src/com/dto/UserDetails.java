package com.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
	@Id
	private int UserID;
	private String UserName;

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		this.UserID = userID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		this.UserName = userName;
	}

}
