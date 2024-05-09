//package org.springframework.example.aop;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.springframework.core.Ordered;
//import org.springframework.stereotype.Component;
//
///**
// * @author rtt
// * @date 2023/9/22 11:08
// */
//@Component
//@Aspect
//public class UserServiceAspect implements Ordered {
//
//	@Pointcut("execution(* org.framework.example.service.UserServiceImpl.love())")
//	public void pointCut() {
//	}
//
//	/**
//	 * @param joinPoint    切点
//	 */
//	@Before("pointCut()")
//	public void before(JoinPoint joinPoint) {
//		System.out.println("Aspect before.");
//	}
//
//	@After("pointCut()")
//	public void after(JoinPoint joinPoint) {
//		System.out.println("Aspect after.");
//	}
//
//	@AfterReturning("pointCut()")
//	public void afterReturning(JoinPoint joinPoint) {
//		System.out.println("Aspect afterReturning.");
//	}
//
//	@AfterThrowing("pointCut()")
//	public void afterThrowing(JoinPoint joinPoint) {
//		System.out.println("Aspect afterThrowing.");
//	}
//
//	@Around("pointCut()")
//	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
//		System.out.println("Aspect aroundBefore.");
//		Object o = joinPoint.proceed();
//		System.out.println("Aspect aroundAfter.");
//		return o;
//	}
//
//	@Override
//	public int getOrder() {
//		return 1;
//	}
//}
