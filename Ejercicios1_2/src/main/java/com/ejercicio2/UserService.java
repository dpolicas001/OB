package com.ejercicio2;

import org.springframework.stereotype.Component;

@Component("UserService")
public class UserService {

    private NotificationService notificationService;


    public UserService(NotificationService notificationService){

        this.notificationService=notificationService;
    }

    public NotificationService getNotificationService(){

        return notificationService;
    }


}
