package org.springframework.example.bean.message;

import org.springframework.stereotype.Component;

@Component
@ConditionalOnSystemProperties(name = "area", value = "cn")
public class ChineseMessageRepository implements MessageRepository {

    @Override
    public void hello() {
        System.out.println("你好");
    }
}
