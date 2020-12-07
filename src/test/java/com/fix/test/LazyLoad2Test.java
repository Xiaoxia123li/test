package com.fix.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fix.dao.LazyLoadDao2;
import com.fix.entity.Plan;
import com.fix.entity.User;

public class LazyLoad2Test {
	SqlSession session;
	LazyLoadDao2 dao;
	@Before
	public void mybefore() throws IOException {
		
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// create factory session
		session = sqlSessionFactory.openSession();
		// 动态代理实现类 dynamic proxy class 在对应的映射接口调用方法
		 dao = session.getMapper(LazyLoadDao2.class);
	}

	@After
	public void myAfter() {
		session.commit();
		session.close();

	}

//	@Test
//	public void findPlan() {
//		User user = dao.getUserInfo(1);
//		System.out.println(" User Name: " + user.getNickName());
//		// + "\nUser Plan " + user.getInfoList()
//
//	}
	
	/**
	 * based on plan id to find user information
	 */
	@Test
	public void findUser() 	{
		Plan plan = dao.getPlanInfo(1);
		System.out.println(plan);
		//System.out.println(plan.getCustomer());
	}

}
