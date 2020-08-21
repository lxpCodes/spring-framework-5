package com.springframe.lxp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestGetBean
 * @Description Spring源码测试
 * @Author liangxp
 * @Date 2020/8/7 16:34
 **/
public class TestGetBean {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println(context.getBean("myTestBean"));
//		System.out.println(context.getBean(LxpTestBean.class));

//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//		UserDao userDao = (UserDao) annotationConfigApplicationContext.getBean("userDao");
//		userDao.printInfo();
	}
}
