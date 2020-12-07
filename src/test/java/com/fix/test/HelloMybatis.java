package com.fix.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.fix.dao.DataDao;
import com.fix.entity.Wisdom;
import com.github.pagehelper.PageHelper;

public class HelloMybatis {

	public static void main(String[] args) throws IOException {

		// get factory
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// create factory session
		SqlSession session = sqlSessionFactory.openSession();
		// 动态代理实现类 dynamic proxy class 在对应的映射接口调用方法
		DataDao dao = session.getMapper(DataDao.class);
		// call method		
		//add
		Wisdom wisdom = new Wisdom();
		//wisdom.setInfo("False with one can be false with two.　对一个人虚假，也会对两个人虚假");
		//wisdom.setAuthor("未知");
		
		//dao.addWis(wisdom);//add
		
		//dao.delWis(14);//del
		
//		wisdom.setId(17);
//		wisdom.setInfo("少说废话");
//		wisdom.setAuthor("未知");
//		dao.updateWis(wisdom);
		Wisdom find1 = dao.findOne(3);
		System.out.println( find1);
		
		
		
		//PageHelper.startPage(1, 5);
		// count total
		//int i = dao.countTotal();
		//System.out.println(i);

		// list all item in table
//		List<Wisdom> list1 = dao.finAll();
//		System.out.println(list1);

//		List<Wisdom> list2 = dao.likeQuery("有");
//		System.out.println(list2);
		
		//list added
//		List list3 = new ArrayList();
//		list3.add(new Wisdom("Who has deceiv'd thee so oft as thy self? 欺骗你的莫过于自己","未知"));
//		list3.add(new Wisdom("Whatever you go, go with all your heart.无论做什么事，一定要全力以赴","未知"));
//		dao.addList(list3);		
		session.commit();
		session.close();

	}

}
