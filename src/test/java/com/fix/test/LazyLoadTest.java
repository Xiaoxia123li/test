package com.fix.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fix.dao.LazyLoadDao;
import com.fix.entity.User;

public class LazyLoadTest {
	SqlSession session;
	LazyLoadDao dao;


	@Before
	public void myBefore() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// create factory session
		session = sqlSessionFactory.openSession();
		// 动态代理实现类 dynamic proxy class 在对应的映射接口调用方法
		dao = session.getMapper(LazyLoadDao.class);
	}

	@After
	public void myAfter() {
		session.commit();
		session.close();
		
	}
	@Test
	public void getPlanList() {
		User user = dao.getPlanByUser(1);
		System.out.println(" User Name: " + user.getNickName() + "\n User Plan" + user.getInfoList());

		
	}
}
