package com.springframe.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestMain
 * @Description TODO
 * @Author liangxp
 * @Date 2020/8/12 17:34
 **/
public class TestMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lookupTest.xml");
		context.setAllowCircularReferences(false);
//		GetBeanTest getBeanTest = (GetBeanTest) context.getBean("getBeanTest");
//		getBeanTest.showMe();

//		TestChangeMethod testChangeMethod = (TestChangeMethod) context.getBean("testChangeMethod");
//		testChangeMethod.changeMe();

		Student student = (Student) context.getBean("student1");
		System.out.println(student);
//		StudentFactory studentFactory = (StudentFactory)context.getBean("&student1");
//		studentFactory.printInfo();
	}
}
