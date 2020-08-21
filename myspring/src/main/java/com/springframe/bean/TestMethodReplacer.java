package com.springframe.bean;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @ClassName TestMethodReplacer
 * @Description TODO
 * @Author liangxp
 * @Date 2020/8/12 17:42
 **/
public class TestMethodReplacer implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("替换了原有的方法");
		return null;
	}
}
