package com.iteso.factory;

/**
 * Created by rvillalobos on 3/17/16.
 */
public class JamaiconSoftwarePackage {
    private JamaiconInstaller installer;
    private JamaiconLicense license;
    private JamaiconInstructions instructions;

    public void setInstaller(JamaiconInstaller installer) {
        this.installer = installer;
    }

    public void setLicense(JamaiconLicense license) {
        this.license = license;
    }

    public void setInstructions(JamaiconInstructions instructions) {
        this.instructions = instructions;
    }

    public void compressFile() {

    }
}
