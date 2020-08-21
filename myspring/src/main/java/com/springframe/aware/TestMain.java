package com.springframe.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestMain
 * @Description Aware相关接口测试
 * @Author liangxp
 * @Date 2020/8/13 16:16
 **/
public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-aware.xml");
//		TestAware testAware = (TestAware) context.getBean("testAware");
//		testAware.testAware();
		UserManager userManager = (UserManager) context.getBean("userManager");
		System.out.println(userManager);

	}
}
