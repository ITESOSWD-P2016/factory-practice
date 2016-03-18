package com.iteso.factory.softProvider.impl;

import com.iteso.factory.installer.impl.JamaiconGameWindowsInstaller;
import com.iteso.factory.installer.impl.JamaiconSportsWindowsInstaller;
import com.iteso.factory.installer.impl.JamaiconStatsWindowsInstaller;
import com.iteso.factory.installer.impl.JamaiconStoreWindowsInstaller;
import com.iteso.factory.softProvider.JamaiconSoftProvider;
import com.iteso.factory.installer.JamaiconInstaller;

/**
 * Created by jorge on 18/03/16.
 */
public class JamaiconWindowsSoftProvider extends JamaiconSoftProvider {
    @Override
    public JamaiconInstaller getJamaiconInstaller(String app) {
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
