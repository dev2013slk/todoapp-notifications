package com.hatchyard.notificationservice.service;

import com.hatchyard.notificationservice.entity.Notification;
import com.hatchyard.notificationservice.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * NotificationServiceImpl
 * All rights reserved.
 * Created by lasath on 2/16/2021
 * Copyright (c) 2017 6willow.com to present.
 */
@Service
public class NotificationServiceImpl implements NotificationService {


    @Autowired
    NotificationRepository notificationRepository;

    @Override
    @Transactional
    public Notification saveNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public List<Notification> listNotifications() {
        return notificationRepository.findAll();
    }
}
