package com.fix.entity;

import java.util.List;

public class Plan {
	int planId;
	int userId;
	String title;//use
//	Date beginTime;
	String motivation;
	int endDays;
	User customer = new User();
//	int icon;
//	int status;
//	Users uinpl = new Users();
	

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	List<PlanItem> planItemList;//plan item in each plan

	public List<PlanItem> getPlanItemList() {
		return planItemList;
	}

	public void setPlanItemList(List<PlanItem> planItemList) {
		this.planItemList = planItemList;
	}

//	public Users getUsers() {
//		return uinpl;
//	}
//
//	public void setUsers(Users users) {
//		this.uinpl = users;
//	}



	public Plan() {
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void setEndDays(int endDays) {
		this.endDays = endDays;
	}

	public String getMotivation() {
		return motivation;
	}

	public void setMotivation(String motivation) {
		this.motivation = motivation;
	}

	@Override
	public String toString() {
		return "\nPlan [ planId=" + planId + ", userId=" + userId + ", title=" + title + ", motivation=" + motivation
				+ ", endDays=" + endDays + "]\n";
	}


//	public String usersString() {
//		String str = "User in plan class " + uinpl;
//		return str;
//
//	}
//	public String listString() {
//		String str = "list " + planItemList;
//		return str;
//
//	}



//	public static void main(String[] args) {
//		Plan pInfo = new Plan();
//		pInfo.setPlanId(1);
//
//		System.out.println(pInfo);
//	}

}
