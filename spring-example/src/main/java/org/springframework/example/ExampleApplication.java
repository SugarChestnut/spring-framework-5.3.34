package org.springframework.example;

import org.springframework.example.bean.MyComponentSub;
import org.springframework.example.web.UserController;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author rtt
 * @date 2023/9/22 11:11
 */
@EnableAspectJAutoProxy
@EnableTransactionManagement
@ComponentScan(basePackageClasses = ExampleApplication.class)
@ImportResource("applicationContext.xml")
// @Component
@MyComponentSub
public class ExampleApplication {

	public static void main(String[] args) {
		// 用于代理类的保存路径
		// System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/rentaotao/Study/source/Spring/spring-framework-5.19");

		/*
		 */
		// AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.framework.example");

		/*
			必须配合 ComponentScan 使用
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExampleApplication.class);

		UserController controller = context.getBean(UserController.class);

		controller.ask();

		context.close();

	}
}
