package org.springframework.example.lifecycle;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author rtt
 * @date 2023/3/27 14:51
 */
 @Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// 时间监听器
		System.out.println("----- 执行 ApplicationListener：onApplicationEvent");
		System.out.println(event.getClass());
	}
}
