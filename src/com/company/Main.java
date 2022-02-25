package com.company;

public class Main {

    public static void main(String[] args) {
        BIOS bios = new BIOS();
        POST post = new POST();


        // Interface Segregation (I)

        //bios functions
        bios.inputValidation();
        bios.outputValidation();


        if(bios.test){
            Kernel kernel = new Kernel();
            OSLoader osLoader = new OSLoader();
            OS os = new OS();

            //bios
            bios.ioMonitoring();

            //post function
            post.checkBoot();

            //kernel functions
            kernel.driverMonitoring();
            kernel.ioMonitoring();


            //os load functions
            osLoader.driverMonitoring();
            osLoader.loadOSAssests();


            //os functions
            os.OSRunning();


        }
        else{
          // post function
          post.checkBoot();
        }

    }
}
