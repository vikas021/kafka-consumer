package com.demo.kafka.consumer.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
//    @value("${kafka.topic.name}")
//
//    private final KafkaTemplate<String,String> kafkaTemplate;
//    private String topic;
//
//    public KafkaConsumerService(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
@KafkaListener(topics ="${kafka.topic.name}",groupId="${spring.kakfa.consumer.group-id}" )
    public void getMessage(ConsumerRecord<String,String> record) {
    System.out.println("Received"+record.value());
    }
}
