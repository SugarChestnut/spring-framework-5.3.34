package org.springframework.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author rtt
 * @date 2023/9/24 00:08
 */
@Aspect
@Component
public class OperationLogAspect {

	/**
	 * 拦截所有被 @OperationLog 注解标识的方法
	 *
	 * @param joinPoint 切点
	 * @param operationLog 注解
	 */
	@Before("@annotation(operationLog)")
	public void before(JoinPoint joinPoint, OperationLog operationLog) {
		System.out.println(operationLog.value());
		System.out.println("Operation log");
	}
}
