package com.hatchyard.notificationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.security.acl.LastOwnerException;

/**
 * Notification
 * All rights reserved.
 * Created by lasath on 2/16/2021
 * Copyright (c) 2017 6willow.com to present.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen_noty")
    @SequenceGenerator(name = "auto_gen_noty", sequenceName = "NOTIFICATION_SEQ")
    private Long notificationId;

    private String content;
}
