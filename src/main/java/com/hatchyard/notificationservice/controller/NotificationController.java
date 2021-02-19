package com.hatchyard.notificationservice.controller;

import com.hatchyard.notificationservice.entity.Notification;
import com.hatchyard.notificationservice.service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * NotificationController
 * All rights reserved.
 * Created by lasath on 2/16/2021
 * Copyright (c) 2017 6willow.com to present.
 */
@RestController
@RequestMapping("/notifications")
@Slf4j
public class NotificationController {

    @Autowired
    NotificationService notificationService;


    @PostMapping("/")
    public Notification saveNotification(@RequestBody Notification notification){

        return notificationService.saveNotification(notification);

    }

    @GetMapping("/")
    public List<Notification> listNotifications(){

        return notificationService.listNotifications();
    }
}
