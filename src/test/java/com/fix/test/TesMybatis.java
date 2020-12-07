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

import com.fix.dao.DataDao;
import com.fix.entity.Wisdom;

/**
 * Junit Test
 * 
 * @author 86762
 *
 */
public class TesMybatis {
	SqlSession session;
	DataDao dao;
	Wisdom wisdom;

	@Before
	public void mybefore() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// create factory session
		session = sqlSessionFactory.openSession();
		// 动态代理实现类 dynamic proxy class 在对应的映射接口调用方法
		dao = session.getMapper(DataDao.class);

	}

	@After
	public void myAfter() {
		session.commit();
		session.close();

	}

	@Test
	public void testFindAll() throws IOException {

		wisdom = new Wisdom();
		// list all item in table
		List<Wisdom> list1 = dao.finAll();
		System.out.println(list1);

	}

	@Test
	public void testCount() {
		// count total
		int i = dao.countTotal();
		System.out.println(i);
	}

}
