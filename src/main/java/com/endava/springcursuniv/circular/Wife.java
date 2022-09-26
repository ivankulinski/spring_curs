package com.endava.springcursuniv.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wife {
    private Husband husband;
    
    @Autowired
    public Wife(Husband husband) {
        this.husband = husband;
    }
    
    public Husband getHusband() {
        return husband;
    }
    
    public void setHusband(Husband husband) {
        this.husband = husband;
    }
}
