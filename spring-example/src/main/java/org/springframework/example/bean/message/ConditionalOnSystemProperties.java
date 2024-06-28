package org.springframework.example.bean.message;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperties {

    String name();

    String value();
}
