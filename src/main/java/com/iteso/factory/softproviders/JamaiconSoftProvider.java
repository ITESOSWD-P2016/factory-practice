package com.iteso.factory.softproviders;

import com.iteso.factory.installers.JamaiconInstaller;

/**
 * Created by rvillalobos on 3/17/16.
 */
public abstract class JamaiconSoftProvider {


    public JamaiconSoftwarePackage getSoftPack(String app, String os){

        JamaiconSoftwarePackage jamaiconSoftwarePackage = new JamaiconSoftwarePackage();
        JamaiconInstaller jamaiconInstaller;

        jamaiconInstaller = getJamaiconInst(app);

        jamaiconSoftwarePackage.setInstaller(jamaiconInstaller);

        JamaiconLicense jamaiconLicense = new JamaiconLicense();

        jamaiconSoftwarePackage.setLicense(jamaiconLicense);

        JamaiconInstructions jamaiconInstructions;
        jamaiconInstructions = new JamaiconInstructions(app);

        jamaiconSoftwarePackage.setInstructions(jamaiconInstructions);

        jamaiconSoftwarePackage.compressFile();

        return jamaiconSoftwarePackage;

    }

    public abstract JamaiconInstaller getJamaiconInst(String app);

}
