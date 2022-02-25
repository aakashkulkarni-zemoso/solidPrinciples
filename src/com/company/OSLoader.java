package com.company;

public class OSLoader extends Kernel{


    // Liskov Substitution (L)
    // Single Responsibility Classes (S)
    // Open for Extension / Closed for Modification (O)

    @Override
    public void driverMonitoring() {
        System.out.println("---- Driver Monitoring (OS loader Level) ----");
    }

    public void loadOSAssests(){
        System.out.println("---- Loading OS Assets ----");
    }

}
