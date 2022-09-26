package com.endava.springcursuniv.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
//@Scope("prototype")
public class Car {

    private Transmission transmission;
    
    @Autowired
    public Car(@Qualifier("manualTransmission") Transmission transmission) {
        this.transmission = transmission;
    }
    
    public void start() {
        System.out.println("Car started.");
        System.out.println(this.transmission.shiftGear());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getTransmission());
    }
    
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    
    public Transmission getTransmission() {
        return transmission;
    }

}
