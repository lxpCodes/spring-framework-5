package com.springframe.aware;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DatePropertyEditor
 * @Description 自定义属性编辑器 然后将自定义属性编辑器注册到spring中,报错
 * Caused by: org.springframework.beans.TypeMismatchException:
 * Failed to convert property value of type 'java.util.LinkedHashMap' to required type 'java.util.Map' for property 'customEditors';
 * nested exception is java.lang.IllegalArgumentException: Cannot convert value of type 'com.springframe.aware.DatePropertyEditor' to required type 'java.lang.Class' for property 'customEditors[java.util.Date]':
 * PropertyEditor [org.springframework.beans.propertyeditors.ClassEditor] returned inappropriate value of type 'com.springframe.aware.DatePropertyEditor'
 * @Author liangxp
 * @Date 2020/8/13 17:54
 **/
public class DatePropertyEditor extends PropertyEditorSupport {

	private String format = "yyyy-MM-dd";

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public void setAsText(String str){
		System.out.println("参数: " + str);
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			Date parse = sdf.parse(str);
			this.setValue(parse);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
