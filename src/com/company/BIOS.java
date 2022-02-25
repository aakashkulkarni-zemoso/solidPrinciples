package com.company;

public class BIOS  implements IOValidation, InputValidation, OutputValidation {

    // Single Responsibility Classes
    // Single Responsibility Classes
    // Open for Extension / Closed for Modification (O)

    public static boolean test = true;
//    public static boolean test = false;

    @Override
    public void inputValidation() {
        System.out.println("Running Input Verification Services");
        if(test) {
            System.out.println("Input Verification Complete");

        }
        else{
            test = false;
        }

    }

    @Override
    public void outputValidation() {
        System.out.println("Running Output Verification Services");
        if(test) {
            System.out.println("Input Verification Complete");

        }
        else{
            test = false;
        }

    }


    @Override
    public void ioMonitoring() {
        System.out.println("Started Background Services: ");
        System.out.println("----- Running IO Monitoring Services ----");
    }
}
