package org.springframework.example.processor;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @author rtt
 * @date 2023/3/28 15:51
 */
public class MyMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {

	}

	@Override
	public void resetBeanDefinition(String beanName) {
		MergedBeanDefinitionPostProcessor.super.resetBeanDefinition(beanName);
	}
}
