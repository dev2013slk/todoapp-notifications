package com.hatchyard.notificationservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * KafkaConsumer
 * All rights reserved.
 * Created by Pc on 2/18/2021
 * Copyright(c) 2021 DirectFN to present.
 */
@Service
@Slf4j
public class KafkaConsumer {

   /* @KafkaListener(topics = "my_topic" , groupId = "my_group_id")
    public void getMessage(String message){
        System.out.println("############### message = " + message);
        log.info(" ################## Kafka Consumer message received : " + message);

    }*/

    @KafkaListener(topics = "my_topic" , groupId = "my_group_id")
    public void getMessage(String message){

        log.info(" KafkaConsumer message : " + message);

    }
}
