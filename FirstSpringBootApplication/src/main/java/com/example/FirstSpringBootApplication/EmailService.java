package com.example.FirstSpringBootApplication;

public class EmailService implements MessageService {

    @Override
    public void SendMessage(String message)
    {
        System.out.println("Email message: "+message);
    }
}
