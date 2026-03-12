package com.rams.workshop.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AlienWithDI {

    // Field-based Dependency Injection
    @Autowired
    AlientAutoWireExample alientAutoWireExample;

    // Constructor-based Dependency Injection
//     public AlienWithDI(AlientAutoWireExample alientAutoWireExample) {
//        this.alientAutoWireExample = alientAutoWireExample;
//    }

    public void code() {
        alientAutoWireExample.Code();
        System.out.println("Alien with DI is coding...");
    }
}
