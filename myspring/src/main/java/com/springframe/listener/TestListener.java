package com.springframe.listener;

import org.springframework.context.ApplicationListener;

/**
 * @ClassName TestListener
 * @Description TODO
 * @Author liangxp
 * @Date 2020/8/14 14:19
 **/
public class TestListener implements ApplicationListener<TestEvent> {

	@Override
	public void onApplicationEvent(TestEvent event) {
			event.print();
	}
}
