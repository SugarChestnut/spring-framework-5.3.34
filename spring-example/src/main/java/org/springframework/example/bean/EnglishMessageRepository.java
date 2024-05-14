package org.springframework.example.bean;

import org.springframework.stereotype.Component;

@Component
@ConditionalOnSystemProperties(name = "area", value = "en")
public class EnglishMessageRepository implements MessageRepository {

    @Override
    public void hello() {
        System.out.println("hello");
    }
}
