package com.company;

public class OS extends OSLoader{

    // Dependency Inversion (D)
    // Open for Extension / Closed for Modification (O)
    public DriverLoading driverLoading = new Kernel();

    public void OSRunning(){
        driverLoading.driverMonitoring();
    }

}
