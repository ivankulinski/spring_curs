package com.endava.springcursuniv.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:transmission.properties")
public class AutomaticTransmission implements Transmission {
    
    @Value("${automatic.transmission.type}")
    private String type;
    
    @Override
    public String shiftGear() {
        return "Automatic transmission installed.";
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return "AutomaticTransmission{" +
                "type='" + type + '\'' +
                '}';
    }
}
