package com.iteso.factory.providers;

import com.iteso.factory.JamaiconInstaller;
import com.iteso.factory.JamaiconInstructions;
import com.iteso.factory.JamaiconLicense;
import com.iteso.factory.JamaiconSoftwarePackage;

/**
 * Created by rvillalobos on 3/17/16.
 */
public abstract class JamaiconSoftProvider {


    public JamaiconSoftwarePackage getSoftPack(String app, String os){

        JamaiconSoftwarePackage jamaiconSoftwarePackage = new JamaiconSoftwarePackage();
        JamaiconInstaller jamaiconInstaller;

        jamaiconInstaller = getJamaiconInstaller(app); //encapsulamiento

        jamaiconSoftwarePackage.setInstaller(jamaiconInstaller);

        JamaiconLicense jamaiconLicense = new JamaiconLicense();

        jamaiconSoftwarePackage.setLicense(jamaiconLicense);

        JamaiconInstructions jamaiconInstructions;
        jamaiconInstructions = new JamaiconInstructions(app);

        jamaiconSoftwarePackage.setInstructions(jamaiconInstructions);

        jamaiconSoftwarePackage.compressFile();

        return jamaiconSoftwarePackage;

    }

    //encapsulamiento
    public abstract  JamaiconInstaller getJamaiconInstaller(String app);
}
