package com.springframe.circle;

/**
 * @ClassName TestA
 * @Description TODO
 * @Author liangxp
 * @Date 2020/8/12 19:25
 **/
public class TestA {
	private TestB testB;

//	public TestA(TestB testB) {
//		this.testB = testB;
//	}

	public void a(){
		testB.b();
	}

	public TestB getTestB() {
		return testB;
	}

	public void setTestB(TestB testB) {
		this.testB = testB;
	}
}
