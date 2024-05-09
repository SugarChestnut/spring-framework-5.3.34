package org.springframework.example.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author rtt
 * @date 2023/3/27 13:53
 */
// @Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// 可以配置 BeanFactory
		System.out.println("----- 执行 BeanFactoryPostProcessor：postProcessBeanFactory 方法");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		// 可以修改 BeanDefinition
		System.out.println("----- 执行 BeanDefinitionRegistryPostProcessor：postProcessBeanDefinitionRegistry 方法");
	}
}
