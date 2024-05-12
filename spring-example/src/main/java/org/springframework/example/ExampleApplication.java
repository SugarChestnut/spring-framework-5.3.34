package org.springframework.example;

import org.springframework.context.annotation.*;
import org.springframework.example.bean.EnableServer;
import org.springframework.example.bean.FtpServer;
import org.springframework.example.bean.HttpServer;
import org.springframework.example.bean.Server;

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

		context.close();

	}
}
