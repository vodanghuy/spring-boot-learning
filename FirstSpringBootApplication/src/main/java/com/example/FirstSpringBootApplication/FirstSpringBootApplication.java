package com.example.FirstSpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {

//		SpringApplication.run(FirstSpringBootApplication.class, args);
		MessageService messageService = new SMSService();
		Client client = new Client(messageService);
		client.SendMessage("Hello World!");
	}

}
