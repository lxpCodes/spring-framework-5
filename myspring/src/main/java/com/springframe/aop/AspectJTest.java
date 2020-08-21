package com.springframe.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @ClassName AspectJTest
 * @Description AOP测试
 * @Author liangxp
 * @Date 2020/8/14 16:45
 **/
@Aspect
public class AspectJTest {

	@Pointcut("execution(* *.test(..))")
	public void test(){

	}

	@Before("test()")
	public void beforeTest(){
		System.out.println("beforeTest");
	}

	@After("test()")
	public void afterTest(){
		System.out.println("afterTest");
	}

	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint joinPoint){
		System.out.println("around before");
		Object object = null;
		try {
			object = joinPoint.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("around after");
		return object;
	}


}
