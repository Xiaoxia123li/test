package com.fix.service;

import org.apache.log4j.Logger;

public class TestService {

	public static void main(String[] args) {

		Logger logger =Logger.getLogger(TestService.class);
		logger.debug("用户增加成功 debug");
		logger.info("用户增加成功 info");
		//System.out.println("上线成功，项目上线需要删除");
	}

}
