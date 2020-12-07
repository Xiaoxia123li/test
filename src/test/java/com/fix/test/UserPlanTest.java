package com.fix.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.fix.dao.UserPlanDao;
import com.fix.entity.Plan;
import com.fix.entity.User;


public class UserPlanTest {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// create factory session
		SqlSession session = sqlSessionFactory.openSession();
		// 动态代理实现类 dynamic proxy class 在对应的映射接口调用方法
		UserPlanDao dao = session.getMapper(UserPlanDao.class);
		User users=  dao.getUserInfo(1);
		System.out.println(" User Name: "+users.getNickName()+"\n User Plan"+users.getInfoList());
			
		//Plan plan =dao.getPlanInfo(2);
		//System.out.println(plan.toString());
		//System.out.println(plan.getCustomer());
		
		
		
		session.commit();
		session.close();
	}

}
