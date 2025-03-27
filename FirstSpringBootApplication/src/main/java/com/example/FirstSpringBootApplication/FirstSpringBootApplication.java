package com.example.FirstSpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		// ApplicationContext
		ApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class, args);
		// Sử dụng Email Service mà không cần khởi tạo
		EmailService emailService = context.getBean(EmailService.class);
		emailService.SendMessage("Hello World"); // Email Message: Hello World
	}

}
