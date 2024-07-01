package org.springframework.example;

import org.springframework.context.annotation.*;
import org.springframework.example.bean.message.MessageRepository;
import org.springframework.example.bean.server.EnableServer;
import org.springframework.example.bean.server.FtpServer;
import org.springframework.example.bean.server.Server;
import org.springframework.example.service.A;

/**
 * @author rtt
 * @date 2023/9/22 11:11
 */
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses = ExampleApplication.class)
@ImportResource("applicationContext.xml")
@Configuration
@EnableServer(FtpServer.class)
public class ExampleApplication {

	public static void main(String[] args) {
		System.out.println("\n\n===========================\n\n");
		System.setProperty("area", "cn");
		// 用于代理类的保存路径
		// System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/rentaotao/Study/source/Spring/spring-framework-5.19");

		/*
		 */
		// AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.framework.example");

		/*
			必须配合 ComponentScan 使用
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExampleApplication.class);

		Server server = context.getBean(Server.class);

		server.start();

		server.stop();

		MessageRepository messageRepository = context.getBean(MessageRepository.class);

		messageRepository.hello();

		A a = context.getBean("a", A.class);

		a.doIt();

		context.close();

		System.out.println("\n\n===========================\n\n");

	}
}
