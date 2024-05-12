package org.springframework.example.bean;

import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
//@Import(ServerImportSelector.class)
@Import(ServerImportBeanDefinitionRegister.class)
public @interface EnableServer {

    @AliasFor("value")
    Class<? extends Server> type() default HttpServer.class;

    @AliasFor("type")
    Class<? extends Server> value() default HttpServer.class;
}
