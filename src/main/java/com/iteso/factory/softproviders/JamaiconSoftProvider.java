package com.iteso.factory.softproviders;

import com.iteso.factory.JamaiconInstructions;
import com.iteso.factory.JamaiconLicense;
import com.iteso.factory.JamaiconSoftwarePackage;
import com.iteso.factory.installers.JamaiconInstaller;

/**
 * Created by rvillalobos on 3/17/16.
 */
public abstract class JamaiconSoftProvider {


    public abstract JamaiconInstaller getJamaiconInstaller(String app);

    public JamaiconSoftwarePackage getSoftPack(String app, String os){

        JamaiconSoftwarePackage jamaiconSoftwarePackage = new JamaiconSoftwarePackage();
        JamaiconInstaller jamaiconInstaller;


        jamaiconInstaller = getJamaiconInstaller(app);




        jamaiconSoftwarePackage.setInstaller(jamaiconInstaller);

        JamaiconLicense jamaiconLicense = new JamaiconLicense();

        jamaiconSoftwarePackage.setLicense(jamaiconLicense);

        JamaiconInstructions jamaiconInstructions;
        jamaiconInstructions = new JamaiconInstructions(app);

        jamaiconSoftwarePackage.setInstructions(jamaiconInstructions);

        jamaiconSoftwarePackage.compressFile();

        return jamaiconSoftwarePackage;

    }
}

/*


*/