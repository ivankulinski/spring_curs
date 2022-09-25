package com.endava.springcursuniv.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    
    public Transmission getTransmission() {
        return transmission;
    }
    
    @Autowired
    @Qualifier("manualTransmission")
    //We need @Qualifier annotation in order to specify exactly what Transmission bean should be wired.
    //Otherwise Spring identifies 2 potential beans for autowiring. It creates ambiguity and triggers UniqueBeanDefinitionException.
    private Transmission transmission;
    
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    
    public void start() {
        System.out.println("Car started.");
        System.out.println(this.transmission.shiftGear());
    }
    
}
