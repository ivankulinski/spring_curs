package com.endava.springcursuniv.models;

public class ManualTransmission implements Transmission {
    
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
}
