package com.fix.dao;


import com.fix.entity.Plan;
import com.fix.entity.User;

public interface LazyLoadDao2 {

	//public User getUserInfo(int userid);// user id to get user plan

	public Plan getPlanInfo(int planid);// search students while user information
	
	

}
