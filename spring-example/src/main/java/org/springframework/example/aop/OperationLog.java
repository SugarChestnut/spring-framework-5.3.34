package org.springframework.example.aop;

import java.lang.annotation.*;

/**
 * @author rtt
 * @date 2023/9/23 23:50
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OperationLog {

	String value();
}
