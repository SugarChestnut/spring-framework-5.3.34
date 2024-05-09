package org.springframework.example.proxy;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;

import java.lang.reflect.Method;

/**
 * @author rtt
 * @date 2023/4/13 22:14
 */
public class MyPointcut implements MethodMatcher, Pointcut {

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		org.springframework.example.proxy.MyProxyAnnotation annotation = method.getAnnotation(org.springframework.example.proxy.MyProxyAnnotation.class);
		return annotation != null;
	}

	@Override
	public boolean isRuntime() {
		return false;
	}

	@Override
	public boolean matches(Method method, Class<?> targetClass, Object... args) {
		// 一般不使用这个方法
		return false;
	}

	/**
	 * 匹配类
	 *
	 * @return 返回类选择器
	 */
	@Override
	public ClassFilter getClassFilter() {
		return clazz -> true;
	}

	@Override
	public MethodMatcher getMethodMatcher() {
		return this;
	}
}
