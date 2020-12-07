package com.fix.dao;

import com.fix.entity.User;

public interface LazyLoadDao {

	public User getPlanByUser(int userId);
}
