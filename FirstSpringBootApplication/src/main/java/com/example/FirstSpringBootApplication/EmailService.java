package com.example.FirstSpringBootApplication;

import org.springframework.stereotype.Component;

@Component // Spring Boot sẽ quản lý Class này, khi dùng không cần khởi tạo, chỉ cần lấy từ Spring Container
public class EmailService implements MessageService {

    @Override
    public void SendMessage(String message)
    {
        System.out.println("Email message: "+message);
    }
}
