package com.iteso.factory;

import com.iteso.factory.installer.JamaiconInst;

/**
 * Created by rvillalobos on 3/17/16.
 */
public class JamaiconSoftwarePackage {
    private JamaiconInst installer;
    private JamaiconLicense license;
    private JamaiconInstructions instructions;

    public void setInstaller(JamaiconInst installer) {
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
