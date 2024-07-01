package org.springframework.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author rtt
 * @date 2024/7/1 14:13
 */
@Component
public class A {

    private B b;

    private C c;

    public A() {
    }

    @Autowired(required = false)
    public A(C c) {
        this.c = c;
    }

    @Autowired(required = false)
    public A(B b) {
        this.b = b;
    }

    public void doIt() {
        System.out.println("b is null " + (b == null));
        System.out.println("c is null " + (c == null));
    }
}
