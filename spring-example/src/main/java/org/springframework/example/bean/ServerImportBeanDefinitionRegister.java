package org.springframework.example.bean;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.stream.Stream;

public class ServerImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        // 调用这个方法
        this.registerBeanDefinitions(importingClassMetadata, registry);
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        ServerImportSelector serverImportSelector = new ServerImportSelector();
        String[] strings = serverImportSelector.selectImports(importingClassMetadata);
        Stream.of(strings)
                .map(BeanDefinitionBuilder::genericBeanDefinition)
                .map(BeanDefinitionBuilder::getBeanDefinition)
                .forEach(beanDefinition -> registry.registerBeanDefinition(beanDefinition.getBeanClassName(), beanDefinition));

    }
}
