package com.springframe.circle;

/**
 * @ClassName TestB
 * @Description TODO
 * @Author liangxp
 * @Date 2020/8/12 19:25
 **/
public class TestB {
	private TestC testC;

	/*public TestB(TestC testC) {
		this.testC = testC;
	}*/

	public TestC getTestC() {
		return testC;
	}

	public void setTestC(TestC testC) {
		this.testC = testC;
	}

	public void b() {
		testC.c();
	}
}
