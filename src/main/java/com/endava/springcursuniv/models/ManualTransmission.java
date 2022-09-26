package com.endava.springcursuniv.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:transmission.properties")
public class ManualTransmission implements Transmission {
    
    @Value("${manual.transmission.number.gears}")
    private int numberGears;
    
    @Override
    public String shiftGear() {
        return "Manual transmission installed.";
    }
    
    public int getNumberGears() {
        return numberGears;
    }
    
    public void setNumberGears(int numberGears) {
        this.numberGears = numberGears;
    }
    
    @Override
    public String toString() {
        return "ManualTransmission{" +
                "numberGears=" + numberGears +
                '}';
    }
}
