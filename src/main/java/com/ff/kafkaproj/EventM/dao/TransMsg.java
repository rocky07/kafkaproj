package com.ff.kafkaproj.EventM.dao;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class TransMsg {
    private String type;
    private String name;
    private int amount;
    private Date time;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }


    
}
