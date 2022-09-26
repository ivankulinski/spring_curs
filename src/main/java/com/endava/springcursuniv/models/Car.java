package com.endava.springcursuniv.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    
    @Autowired
    @Qualifier("automatic")
    private Transmission transmission;
    
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    
    public Transmission getTransmission() {
        return transmission;
    }
    
    public void start() {
        System.out.println("Car started.");
        System.out.println(this.transmission.shiftGear());
    }
    
}
