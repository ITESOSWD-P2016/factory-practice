package com.iteso.factory.provider;

import com.iteso.factory.JamaiconInstructions;
import com.iteso.factory.JamaiconLicense;
import com.iteso.factory.JamaiconSoftwarePackage;
import com.iteso.factory.installer.JamaiconInst;

/**
 * Created by rvillalobos on 3/17/16.
 */
public abstract class JamaiconSoftProvider {


    public JamaiconSoftwarePackage getSoftPack(String app, String os){

        JamaiconSoftwarePackage jamaiconSoftwarePackage = new JamaiconSoftwarePackage();
        JamaiconInst jamaiconInst = getJamaiconInst(app);
        

        jamaiconSoftwarePackage.setInstaller(jamaiconInst);

        JamaiconLicense jamaiconLicense = new JamaiconLicense();

        jamaiconSoftwarePackage.setLicense(jamaiconLicense);

        JamaiconInstructions jamaiconInstructions;
        jamaiconInstructions = new JamaiconInstructions(app);

        jamaiconSoftwarePackage.setInstructions(jamaiconInstructions);

        jamaiconSoftwarePackage.compressFile();

        return jamaiconSoftwarePackage;

    }

	public abstract JamaiconInst getJamaiconInst(String app);


}
