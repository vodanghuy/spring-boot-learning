package com.example.FirstSpringBootApplication;

public class Client {
    MessageService messageService;

    public Client (MessageService messageService)
    {
        this.messageService = messageService;
    }
    public void SendMessage(String message)
    {
        messageService.SendMessage(message);
    }
}
