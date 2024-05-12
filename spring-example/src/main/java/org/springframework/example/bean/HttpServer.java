package org.springframework.example.bean;

public class HttpServer implements Server{
    @Override
    public void start() {
        System.out.println("HttpServer start");
    }

    @Override
    public void stop() {
        System.out.println("HttpServer stop");
    }
}
