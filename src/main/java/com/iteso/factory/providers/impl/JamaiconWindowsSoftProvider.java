package com.iteso.factory.providers.impl;

import com.iteso.factory.JamaiconInstaller;
import com.iteso.factory.installers.*;

/**
 * Created by User on 18/03/2016.
 */
public class JamaiconWindowsSoftProvider {

    public JamaiconInstaller getJamaiconInstaller(String app) {

        JamaiconInstaller jamaiconInstaller;

        if (app.equals("sports"))
            jamaiconInstaller = new JamaiconSportsWindowsInstaller();
        else if (app.equals("stats"))
            jamaiconInstaller = new JamaiconStatsWindowsInstaller();
        else if (app.equals("store"))
            jamaiconInstaller = new JamaiconStoreWindowsInstaller();
        else if (app.equals("game"))
            jamaiconInstaller = new JamaiconGameWindowsInstaller();
        else
            jamaiconInstaller = null;

        return jamaiconInstaller;
    }
}
