package com.springframe.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestAspectJ
 * @Description 测试AOP
 * @Author liangxp
 * @Date 2020/8/14 16:46
 **/
public class TestAspectJ {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
		TestBean testBean = (TestBean) context.getBean("testBean");
		testBean.test();

	}
}
