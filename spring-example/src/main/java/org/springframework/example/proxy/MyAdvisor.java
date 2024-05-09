package org.springframework.example.proxy;

import org.aopalliance.aop.Advice;
import org.springframework.example.proxy.MyPointcut;
import org.springframework.example.proxy.MyProxyInterceptor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.stereotype.Component;

/**
 * 在创建符合代理类的时候，将通知织入其中
 *
 * @author rtt
 * @date 2023/4/13 22:11
 */
@Component
public class MyAdvisor extends AbstractPointcutAdvisor {

	private static final long serialVersionUID = 1L;

	private final MyPointcut pointcut = new MyPointcut();

	private final MyProxyInterceptor interceptor = new MyProxyInterceptor();

	@Override
	public Pointcut getPointcut() {
		return this.pointcut;
	}

	@Override
	public Advice getAdvice() {
		return this.interceptor;
	}
}
