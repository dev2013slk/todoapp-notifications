package com.hatchyard.notificationservice.service;

import com.hatchyard.notificationservice.entity.Notification;

import java.util.List;

/**
 * NotificationService
 * All rights reserved.
 * Created by lasath on 2/16/2021
 * Copyright (c) 2017 6willow.com to present.
 */
public interface NotificationService {


    Notification saveNotification(Notification notification);

    List<Notification> listNotifications();
}
