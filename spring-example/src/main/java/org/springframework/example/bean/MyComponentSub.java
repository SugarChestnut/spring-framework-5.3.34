package org.springframework.example.bean;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author rtt
 * @date 2023/3/27 11:03
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
public @interface MyComponentSub {
}
