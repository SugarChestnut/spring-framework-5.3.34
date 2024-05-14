package org.springframework.example.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * servlet 3.0 特性，用来替代 web.xml
 * servlet 3.0 之前，再 web.xml 配置 ServletContextListener 来加载 spring 容器
 */
//public class ExampleAnnotationWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//    @Override
//    protected Class<?>[] getRootConfigClasses() {
//        return new Class[]{RootConfig.class};
//    }
//
//    @Override
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class[]{WebMvcConfig.class};
//    }
//
//    @Override
//    protected String[] getServletMappings() {
//        return new String[] {"/*"};
//    }
//}
