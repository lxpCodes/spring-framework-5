package com.springframe.convert;


import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Spring2DateConverter
 * @Description TODO
 * @Author liangxp
 * @Date 2020/8/14 15:06
 **/
public class Spring2DateConverter implements Converter<String,Date> {

	@Override
	public Date convert(String source) {

		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return simpleDateFormat.parse(source);
		} catch (Exception e) {
			return null;
		}
	}
}
