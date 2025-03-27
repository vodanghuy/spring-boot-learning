package com.example.FirstSpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration // Chỉ đinh lớp cấu hình
public class AppConfig {

    @Bean //Tạo bean
    @Scope("prototype") // không nhập mặc định là "singleton"
    public Boy boy(){
        return new Boy();
    }
    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
}
