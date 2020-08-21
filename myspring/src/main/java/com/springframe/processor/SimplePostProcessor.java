package com.springframe.processor;

/**
 * @ClassName SimplePostProcessor
 * @Description 测试PostProcessor
 * @Author liangxp
 * @Date 2020/8/14 11:14
 **/
public class SimplePostProcessor {
	private String connectionString;
	private String password;
	private String username;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
