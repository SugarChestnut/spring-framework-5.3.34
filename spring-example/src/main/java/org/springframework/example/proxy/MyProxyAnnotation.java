package org.springframework.example.proxy;

import java.lang.annotation.*;

/**
 * @author rtt
 * @date 2023/4/13 22:34
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MyProxyAnnotation {
}
