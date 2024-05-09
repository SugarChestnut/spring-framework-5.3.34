package org.springframework.example.lifecycle;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @author rtt
 * @date 2023/3/27 14:40
 */
// @Component
public class MySmartLifecycle implements SmartLifecycle {

	volatile boolean isRunning;

	@Override
	public void start() {
		isRunning = true;
		System.out.println("----- 执行 SmartLifecycle：start");
	}

	@Override
	public void stop() {
		isRunning = false;
		System.out.println("----- 执行 SmartLifecycle：stop");
	}

	@Override
	public boolean isRunning() {
		return isRunning;
	}
}
