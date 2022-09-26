package com.endava.springcursuniv.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@PropertySource(value = "classpath:application.properties")
public class Car {

    @Value("${car.config.model}")
    private String model;

    @Value("${car.config.year}")
    private int year;
    
    private Transmission transmission;
    
    @Autowired
    public Car(@Qualifier("automaticTransmission") Transmission transmission) {
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
    
    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + '\'' +
                ", year=" + year + '}';
    }
}
