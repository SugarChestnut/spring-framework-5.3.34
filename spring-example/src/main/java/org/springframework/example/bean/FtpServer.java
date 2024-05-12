package org.springframework.example.bean;

public class FtpServer implements Server{
    @Override
    public void start() {
        System.out.println("FtpServer start");
    }

    @Override
    public void stop() {
        System.out.println("FtpServer stop");
    }
}
