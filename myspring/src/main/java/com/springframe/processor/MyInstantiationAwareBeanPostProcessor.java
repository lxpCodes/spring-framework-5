package com.springframe.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 * @ClassName MyInstantiationAwareBeanPostProcessor
 * @Description TODO
 * @Author liangxp
 * @Date 2020/8/14 13:30
 **/
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("====MyInstantiationAwareBeanPostProcessor的postProcessBeforeInitialization调用了============");

		return null;
	}

}
