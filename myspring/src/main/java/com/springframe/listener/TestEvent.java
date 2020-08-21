package com.springframe.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @ClassName TestEvent
 * @Description TODO
 * @Author liangxp
 * @Date 2020/8/14 14:16
 **/
public class TestEvent extends ApplicationEvent {

	private static final long serialVersionUID = 9031246629662423468L;

	public String msg;

	public TestEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public TestEvent(Object source) {
		super(source);
	}

	public void print(){
		System.out.println("打印自定义事件信息: " + source + ":" + msg);
	}
}
