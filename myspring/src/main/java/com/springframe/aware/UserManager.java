package com.springframe.aware;

import java.util.Date;

/**
 * @ClassName UserManager
 * @Description 测试属性编辑器
 * @Author liangxp
 * @Date 2020/8/13 17:48
 **/
public class UserManager {
	private Date dataValue;

	@Override
	public String toString() {
		return "{" +
				"dataValue=" + dataValue +
				'}';
	}

	public Date getDataValue() {
		return dataValue;
	}

	public void setDataValue(Date dataValue) {
		this.dataValue = dataValue;
	}
}
