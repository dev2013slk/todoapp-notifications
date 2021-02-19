package com.hatchyard.notificationservice.repository;

import com.hatchyard.notificationservice.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * NotificationRepository
 * All rights reserved.
 * Created by lasath on 2/16/2021
 * Copyright (c) 2017 6willow.com to present.
 */
public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
