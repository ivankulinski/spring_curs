package com.endava.springcursuniv.models;

public class AutomaticTransmission implements Transmission {
    
    private String type;
    
    @Override
    public String shiftGear() {
        return "Manual transmission installed.";
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
