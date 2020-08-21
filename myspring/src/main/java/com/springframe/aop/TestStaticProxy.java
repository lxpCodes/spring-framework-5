package com.springframe.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestStaticProxy
 * @Description 静态代理测试
 * @Author liangxp
 * @Date 2020/8/17 16:23
 **/
public class TestStaticProxy {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
		TestBean testBean = (TestBean) context.getBean("testBean");
		testBean.test();
	}
}
