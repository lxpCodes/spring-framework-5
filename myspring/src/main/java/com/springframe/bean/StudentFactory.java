package com.springframe.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName StudentFactory
 * @Description TODO
 * @Author liangxp
 * @Date 2020/8/12 17:55
 **/
public class StudentFactory implements FactoryBean<Student> {
	private String studengInfo;

	public StudentFactory(String s) {
		this.studengInfo = s;
	}

	@Override
	public Student getObject() throws Exception {
		Student student = new Student();
		String[] split = studengInfo.split(",");
		student.setName(split[0]);
		student.setAge(Integer.valueOf(split[1]));
		student.setHeight(Double.valueOf(split[2]));

		return student;
	}

	@Override
	public Class<Student> getObjectType() {
		return Student.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	public String getStudengInfo() {
		return studengInfo;
	}

	public void setStudengInfo(String studengInfo) {
		this.studengInfo = studengInfo;
	}

	public void printInfo(){
		System.out.println("i am StudentFactory");
	}
}
