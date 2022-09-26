package com.endava.springcursuniv.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    
    public Transmission getTransmission() {
        return transmission;
    }
    
    private Transmission transmission;
    
    @Autowired
    @Qualifier("automatic")
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    
    public void start() {
        System.out.println("Car started.");
        System.out.println(this.transmission.shiftGear());
    }
    
}
