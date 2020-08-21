package com.springframe.processor;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @ClassName PropertyConfigDemo
 * @Description TODO
 * @Author liangxp
 * @Date 2020/8/14 11:29
 **/
public class PropertyConfigDemo {
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory(new ClassPathResource("spring-processor.xml"));

		BeanFactoryPostProcessor bfpp = (ObscenityRemovingBeanFactoryPostProcessor) beanFactory.getBean("bfpp");

		bfpp.postProcessBeanFactory(beanFactory);
		System.out.println(beanFactory.getBean("simpleBean"));

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-processor.xml");
		SimplePostProcessor simpleBean = (SimplePostProcessor) context.getBean("simpleBean");
		System.out.println(simpleBean);

	}
}
