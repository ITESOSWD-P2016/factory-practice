package com.iteso.factory;

/**
 * Created by rvillalobos on 3/17/16.
 */
public class JamaiconSoftProvider {


    public JamaiconSoftwarePackage getSoftPack(String app, String os){

        JamaiconSoftwarePackage jamaiconSoftwarePackage = new JamaiconSoftwarePackage();
        JamaiconInstaller jamaiconInstaller;
        if(os.equals("android")) {
            if (app.equals("sports"))
                jamaiconInstaller = new JamaiconSportsAndroidInstaller();
            else if (app.equals("stats"))
                jamaiconInstaller = new JamaiconStatsAndroidInstaller();
            else if (app.equals("store"))
                jamaiconInstaller = new JamaiconStoreAndroidInstaller();
            else if (app.equals("game"))
                jamaiconInstaller = new JamaiconGameAndroidInstaller();
            else
                jamaiconInstaller = null;
        }
        else if(os.equals("ios")) {
            if (app.equals("sports"))
                jamaiconInstaller = new JamaiconSportsIOSInstaller();
            else if (app.equals("stats"))
                jamaiconInstaller = new JamaiconStatsIOSInstaller();
            else if (app.equals("store"))
                jamaiconInstaller = new JamaiconStoreIOSInstaller();
            else if (app.equals("game"))
                jamaiconInstaller = new JamaiconGameIOSInstaller();
            else
                jamaiconInstaller = null;
        }
        else
            jamaiconInstaller = null;

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
