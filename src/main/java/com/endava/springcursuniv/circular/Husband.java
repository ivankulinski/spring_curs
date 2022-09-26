package com.endava.springcursuniv.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Husband {
    
    private Wife wife;
    
    @Autowired
    public Husband(Wife wife) {
        this.wife = wife;
    }
    
    public Wife getWife() {
        return wife;
    }
    
    public void setWife(Wife wife) {
        this.wife = wife;
    }
}

/**
 * Possible solutions:
 * 
 * 1. Redesign
 * When we have a circular dependency, it’s likely we have a design problem and that the responsibilities are not well separated. 
 * 
 * 2. @Lazy
 * A simple way to break the cycle is by telling Spring to initialize one of the beans lazily. 
 * So, instead of fully initializing the bean, it will create a proxy to inject it into the other bean. 
 * The injected bean will only be fully created when it’s first needed.
 * 
 * 3. Setter/Field Injection
 * We can address the problem by changing the ways our beans are wired — to use setter injection (or field injection) instead of constructor injection. 
 * This way, Spring creates the beans, but the dependencies are not injected until they are needed.
 * !!! But in this case we have to remove out custom constructors !!!
 * 
 * 4. @PostConstruct
 * !!! But in this case we have to remove out custom constructors !!!
 *     @PostConstruct
 *     public void init() {
 *         wife.setHusband(this);
 *     }
 * 
 * 5. Implement ApplicationContextAware and InitializingBean
 */
