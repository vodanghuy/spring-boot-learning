package com.example.FirstSpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		// ApplicationContext
		ApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class, args);
		Boy boy = context.getBean(Boy.class);
		System.out.println(boy);
		Boy boy1 = context.getBean(Boy.class);
		System.out.println(boy1);
		/*
		Nếu sử dụng scope singleton thì giá trị của boy là 1
		dù cho có lấy nhiều lần giá trị.
		Còn nếu sử dụng prototype, mỗi lần lấy giá trị thì sẽ
		khởi tạo một giá trị mới.
		  */
	}

}
