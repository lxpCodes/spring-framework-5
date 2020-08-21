package com.springframe.bean;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author liangxp
 * @Date 2020/8/12 17:28
 **/
public class Teacher extends User{

	@Override
	public void showMe(){
		System.out.println("i am Teacher");
	}
}
