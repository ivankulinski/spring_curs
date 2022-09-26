package com.endava.springcursuniv.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
