package com.fix.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.fix.dao.MmPlandao;
import com.fix.entity.Plan;
import com.fix.entity.PlanItem;

public class MmPlanTest {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// create factory session
		SqlSession session = sqlSessionFactory.openSession();
		// 动态代理实现类 dynamic proxy class 在对应的映射接口调用方法

		MmPlandao dao = session.getMapper(MmPlandao.class);
		List<Plan> plist = dao.planList();//plan list
		System.out.println(plist);//all title
		for (Plan plan : plist) {
			System.out.println(plist);//all title
			//List<PlanItem> itemList = plan.getPlanItemList();//title in each plan
			//System.out.println(itemList);
//			for (PlanItem plan2 : itemList) {
//				System.out.println(plan2.getUser().getNickName());
			}
//		}
		session.commit();
		session.close();
	}

}
