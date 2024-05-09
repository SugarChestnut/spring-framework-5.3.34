package org.springframework.example.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author rtt
 * @date 2023/4/13 22:09
 */
public class MyProxyInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		Object result = invocation.proceed();
		System.out.println("my proxy interceptor");
		return result;
	}
}
