package com.springframe.lxp;

/**
 * @ClassName LxpTestBean
 * @Description TODO
 * @Author liangxp
 * @Date 2020/8/7 16:33
 **/
public class LxpTestBean {
	private String name = "liangxp";

	public LxpTestBean(String name) {
		this.name = name;
	}

	public LxpTestBean() {
	}

	@Override
	public String toString() {
		return "LxpTestBean{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
