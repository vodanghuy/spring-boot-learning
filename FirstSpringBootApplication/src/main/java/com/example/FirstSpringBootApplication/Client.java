package com.example.FirstSpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {
    /*
    Thay vì sử dụng Constructor Injection, Annotation này sẽ
    giúp lớp Client tự động tiêm MessageService vào chính nó
     */
    @Autowired
    MessageService messageService;

    public void SendMessage(String message)
    {
        messageService.SendMessage(message);
    }
}
