package org.springframework.example.config.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.example.ExampleApplication;

/**
 * @author rtt
 * @date 2024/5/13 13:28
 */
@ComponentScan(basePackageClasses = ExampleApplication.class)
public class RootConfig {
}
