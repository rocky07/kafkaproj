package com.ff.kafkaproj.EventM.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    private static String topic="kafka-topic";
    private KafkaTemplate<String,String> template;
    



    @Autowired
    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.template = kafkaTemplate;
    }
    

    public void sendMessage(String message){
        template.send(topic,message);
        System.out.println("messag send ::"+message);
    }
    
}
