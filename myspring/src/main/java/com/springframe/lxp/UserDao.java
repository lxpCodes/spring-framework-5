package com.springframe.lxp;

import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDao
 * @Description 测试注解
 * @Author liangxp
 * @Date 2020/8/10 16:42
 **/
@Repository("userDao")
public class UserDao {

	public void printInfo(){
		System.out.println("打印测试");
	}
}
