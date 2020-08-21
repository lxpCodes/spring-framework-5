package com.springframe.bean;

/**
 * @ClassName Student
 * @Description TODO
 * @Author liangxp
 * @Date 2020/8/12 17:33
 **/
public class Student extends User{

	private String name;
	private int age;
	private double height;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void showMe(){
		System.out.println("i am student");
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"name='" + name + '\'' +
				", age=" + age +
				", height=" + height +
				'}';
	}
}
