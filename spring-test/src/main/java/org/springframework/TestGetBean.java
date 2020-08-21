package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestGetBean
 * @Description TODO
 * @Author liangxp
 * @Date 2020/8/7 16:34
 **/
public class TestGetBean {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println(context.getBean("myTestBean"));
		System.out.println(context.getBean(LxpTestBean.class));
	}
}
