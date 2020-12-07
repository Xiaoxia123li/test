package com.fix.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.fix.dao.DataDao;
import com.fix.dao.DynamDao;
import com.fix.entity.Wisdom;

public class DynamMybatis {

	public static void main(String[] args) throws IOException {
		// get factory
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// create factory session
		SqlSession session = sqlSessionFactory.openSession();
		// 动态代理实现类 dynamic proxy class 在对应的映射接口调用方法
		DynamDao dao = session.getMapper(DynamDao.class);

		HashMap map = new HashMap();
		map.put("author", "罗切福考尔德");
		List list = dao.dynamQuery(map);
		System.out.println("dynamic sql: " + list);
		
		//error empty
//		Wisdom wis = new Wisdom();
//		wis.setId(3);
//		//wis.setAuthor("哈佛");
//		System.out.println(wis);
		
	

		session.commit();
		session.close();

	}

}
