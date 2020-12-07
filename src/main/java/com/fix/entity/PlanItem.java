package com.fix.entity;

import java.sql.Date;

public class PlanItem {
	int id;
	int planId;
	int userId;
	Date clockTime;//use
	int mood;

	
//	Plan plan;
//	User user;
	
	public PlanItem() {
	}

	public PlanItem(int id, int planId, int userId, Date clockTimeDate, int mood) {
		super();
		this.id = id;
		this.planId = planId;
		this.userId = userId;
		this.clockTime = clockTimeDate;
		this.mood = mood;
	}

//	public Users getUsers() {
//		return users;
//	}
//
//	public void setUsers(Users users) {
//		this.users = users;
//	}
//
//	public Plan getPlan() {
//		return plan;
//	}
//
//	public void setPlan(Plan plan) {
//		this.plan = plan;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getClockTime() {
		return clockTime;
	}

	public void setClockTime(Date clockTime) {
		this.clockTime = clockTime;
	}

	public int getMood() {
		return mood;
	}

	public void setMood(int mood) {
		this.mood = mood;
	}

	@Override
	public String toString() {
		return "\nPlanItem [id=" + id + ", planId=" + planId + ", userId=" + userId + ", clockTime=" + clockTime
				+ ", mood=" + mood + "]\n";
	}

	
//	public String  customerString() {
//		String str = "User " + users;
//		return str;
//		
//	}
//	public String  planString() {
//		String str = "Plan " + plan;
//		return str;
//		
//	}


}
