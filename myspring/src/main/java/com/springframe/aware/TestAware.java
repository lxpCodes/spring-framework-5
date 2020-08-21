package com.springframe.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @ClassName TestAware
 * @Description 可以通过beanFactory得到spring管理的bean
 * @Author liangxp
 * @Date 2020/8/13 16:12
 **/
public class TestAware implements BeanFactoryAware {
	private BeanFactory beanFactory;

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	public void testAware(){
		//通过hello这个bean id从beanFactory获取实例
		Hello hello = (Hello) beanFactory.getBean("hello");
		hello.say();
	}
}
