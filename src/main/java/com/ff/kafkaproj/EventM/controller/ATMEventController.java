package com.ff.kafkaproj.EventM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ff.kafkaproj.EventM.service.KafkaProducerService;

@RestController
@RequestMapping("/atmevents")
public class ATMEventController {

    @Autowired
    KafkaProducerService kafkaService;
    /*@Autowired
    public ATMEventController(KafkaProducerService service){
        this.kafkaService=service;
    }*/

    @GetMapping("/{message}")
    public void postTrans(@PathVariable String message){
        // pulbis the message to kafka producter 
        kafkaService.sendMessage("ello world");
    }

    
}
