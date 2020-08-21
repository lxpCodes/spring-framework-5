package com.springframe.circle;

/**
 * @ClassName TestC
 * @Description TODO
 * @Author liangxp
 * @Date 2020/8/12 19:25
 **/
public class TestC {

	private TestA testA;



	/*public TestC(TestA testA) {
		this.testA = testA;
	}*/

	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		this.testA = testA;
	}

	public void c() {
		testA.a();
	}


}
