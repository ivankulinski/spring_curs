package com.endava.springcursuniv.models;

import org.springframework.stereotype.Component;

@Component("automatic")
public class AutomaticTransmission implements Transmission {
    
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
}
