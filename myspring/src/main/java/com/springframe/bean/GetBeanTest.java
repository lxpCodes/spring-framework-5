package com.springframe.bean;

/**
 * @ClassName GetBeanTest
 * @Description TODO
 * @Author liangxp
 * @Date 2020/8/12 17:30
 **/
public abstract class GetBeanTest {

	public void showMe(){
		this.getBean().showMe();
	}
	public abstract User getBean();
}
