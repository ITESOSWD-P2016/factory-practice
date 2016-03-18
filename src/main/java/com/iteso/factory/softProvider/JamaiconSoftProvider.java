package com.iteso.factory.softProvider;

import com.iteso.factory.JamaiconInstructions;
import com.iteso.factory.JamaiconLicense;
import com.iteso.factory.JamaiconSoftwarePackage;
import com.iteso.factory.installer.JamaiconInstaller;

/**
 * Created by rvillalobos on 3/17/16.
 */
public abstract class JamaiconSoftProvider {


    public JamaiconSoftwarePackage getSoftPack(String app, String os){

        JamaiconSoftwarePackage jamaiconSoftwarePackage = new JamaiconSoftwarePackage();
        JamaiconInstaller jamaiconInstaller = null;

        jamaiconSoftwarePackage.setInstaller(jamaiconInstaller);

        JamaiconLicense jamaiconLicense = new JamaiconLicense();

        jamaiconSoftwarePackage.setLicense(jamaiconLicense);

        JamaiconInstructions jamaiconInstructions;
        jamaiconInstructions = new JamaiconInstructions(app);

        jamaiconSoftwarePackage.setInstructions(jamaiconInstructions);

        jamaiconSoftwarePackage.compressFile();

        return jamaiconSoftwarePackage;

    }

    public abstract JamaiconInstaller getJamaiconInstaller(String app);
}
