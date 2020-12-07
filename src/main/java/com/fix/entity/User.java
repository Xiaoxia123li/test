package com.fix.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
	int userId;
	String nickName;
	String phoneNumber;

	public User(){}


	List<Plan> infoList = new ArrayList<Plan>();

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public List<Plan> getInfoList() {
		return infoList;
	}

	public void setInfoList(List<Plan> infoList) {
		this.infoList = infoList;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", nickName=" + nickName + ", phoneNumber=" + phoneNumber + "]";
	}


	
}
