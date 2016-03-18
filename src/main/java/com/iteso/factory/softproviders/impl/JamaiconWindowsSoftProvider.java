package com.iteso.factory.softproviders.impl;

import com.iteso.factory.installers.JamaiconInstaller;
import com.iteso.factory.installers.impl.windowsinstallers.JamaiconGameWindowsInstaller;
import com.iteso.factory.installers.impl.windowsinstallers.JamaiconSportsWindowsInstaller;
import com.iteso.factory.installers.impl.windowsinstallers.JamaiconStatsWindowsInstaller;
import com.iteso.factory.installers.impl.windowsinstallers.JamaiconStoreWindowsInstaller;
import com.iteso.factory.softproviders.JamaiconSoftProvider;

/**
 * Created by luis_ on 18/03/2016.
 */
public class JamaiconWindowsSoftProvider extends JamaiconSoftProvider {
    @Override
    public JamaiconInstaller getJamaiconInst(String app) {
        JamaiconInstaller jamaiconInstaller;

        if (app.equals("sports"))
            return new JamaiconSportsWindowsInstaller();
        else if (app.equals("stats"))
            return new JamaiconStatsWindowsInstaller();
        else if (app.equals("store"))
            return new JamaiconStoreWindowsInstaller();
        else if (app.equals("game"))
            return new JamaiconGameWindowsInstaller();
        else
            return null;
    }
}
