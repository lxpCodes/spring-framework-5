package com.springframe.aop;

/**
 * @ClassName TestBean
 * @Description 测试AOP的bean
 * @Author liangxp
 * @Date 2020/8/14 16:44
 **/
public class TestBean {
	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public void test(){
		System.out.println("this is a test");
	}
}
