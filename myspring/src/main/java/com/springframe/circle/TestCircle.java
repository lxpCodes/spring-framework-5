package com.springframe.circle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestCircle
 * @Description Spring循环依赖测试
 * 				无法解决构造器的循环依赖，使用构造器方式注入是会报错Requested bean is currently in creation: Is there an unresolvable circular reference?
 *				属性注入可解决
 * @Author liangxp
 * @Date 2020/8/12 19:30
 **/
public class TestCircle {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-circle.xml");
		System.out.println(context.getBean("testA"));
	}
}
