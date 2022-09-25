package com.endava.springcursuniv.models;

public class Car {
    
    private Transmission transmission;
    
    
    public Transmission getTransmission() {
        return transmission;
    }
    
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    
    public void start() {
        System.out.println("Car started.");
        System.out.println(this.transmission.shiftGear());
    }
    
}
