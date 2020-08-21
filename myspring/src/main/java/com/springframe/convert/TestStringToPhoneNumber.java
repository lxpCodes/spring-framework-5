package com.springframe.convert;

import org.springframework.core.convert.support.DefaultConversionService;

import java.util.Date;

/**
 * @ClassName TestStringToPhoneNumber
 * @Description 自定义类型转换器测试
 * @Author liangxp
 * @Date 2020/8/14 15:16
 **/
public class TestStringToPhoneNumber {
	public static void main(String[] args) {
		DefaultConversionService conversionService = new DefaultConversionService();
		conversionService.addConverter(new Spring2DateConverter());

		String dateStrr = "2020-08-14 13:22:22";
		Date convert = conversionService.convert(dateStrr, Date.class);
		System.out.println(convert);
	}
}
