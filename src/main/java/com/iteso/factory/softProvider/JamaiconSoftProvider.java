package com.iteso.factory.softProvider;

import com.iteso.factory.JamaiconInstructions;
import com.iteso.factory.JamaiconLicense;
import com.iteso.factory.JamaiconSoftwarePackage;
import com.iteso.factory.installer.JamaiconInstaller;
import com.iteso.factory.installer.impl.*;

/**
 * Created by rvillalobos on 3/17/16.
 */
public abstract class JamaiconSoftProvider {

    public abstract JamaiconInstaller getJamaiconInst(String app);

    public JamaiconSoftwarePackage getSoftPack(String app){

        JamaiconSoftwarePackage jamaiconSoftwarePackage = new JamaiconSoftwarePackage();
        JamaiconInstaller jamaiconInstaller = getJamaiconInst(app);


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
