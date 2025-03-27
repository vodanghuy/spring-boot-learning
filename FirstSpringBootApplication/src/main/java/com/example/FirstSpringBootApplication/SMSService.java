package com.example.FirstSpringBootApplication;

public class SMSService implements MessageService{

    @Override
    public void SendMessage(String message)
    {
        System.out.println("SMS message: "+message);
    }
}
