package com.springframe.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestMain
 * @Description 测试Spring监听的应用
 * @Author liangxp
 * @Date 2020/8/14 14:24
 **/
public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-listener.xml");
		TestEvent event = new TestEvent("hello,myself event","msg");
		context.publishEvent(event);
	}
}
