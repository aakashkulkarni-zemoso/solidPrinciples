package com.company;

public class POST extends BIOS {

    // Single Responsibility Classes (S)
    // Open for Extension / Closed for Modification (O)

    BIOS bios = new BIOS();
    public boolean beeps = bios.test;

    public void checkBoot(){
        if(beeps){
            System.out.println("---- Loading System Configuration ----");
        }
        else{
            System.out.println("---- Failed to Load ----");
            System.out.println("Error: BIOS needs to be repaired");
        }
    }

}
