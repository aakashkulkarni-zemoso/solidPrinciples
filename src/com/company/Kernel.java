package com.company;


public class Kernel implements IOValidation, DriverLoading {

    // Single Responsibility Classes (S)
    // Open for Extension / Closed for Modification (O)
    @Override
    public void ioMonitoring() {
        System.out.println("---- Running IO Services (Kernel Level) ----");
    }


    @Override
    public void driverMonitoring() {
        System.out.println("---- Driver Monitoring (Kernel Level) ----");
    }
}
