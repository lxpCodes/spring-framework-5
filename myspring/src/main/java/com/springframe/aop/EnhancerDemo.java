package com.springframe.aop;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName EnhancerDemo
 * @Description 测试cglib
 * @Author liangxp
 * @Date 2020/8/17 15:03
 **/
public class EnhancerDemo {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(EnhancerDemo.class);
		enhancer.setCallback(new MethodInterceptorImpl());

		EnhancerDemo demo = (EnhancerDemo)enhancer.create();
		demo.test();
		System.out.println(demo);

	}

	private void test() {
		System.out.println("EnhancerDemo test()");
	}


	private static class MethodInterceptorImpl implements MethodInterceptor{

		@Override
		public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
			System.err.println("Before invoke " + method);
			Object result = methodProxy.invokeSuper(obj, objects);
			System.err.println("After invoke " + method);
			return result;
		}
	}

}
