package com.iteso.factory.softProvider.impl;

import com.iteso.factory.installer.JamaiconInstaller;
import com.iteso.factory.installer.impl.JamaiconGameIOSInstaller;
import com.iteso.factory.installer.impl.JamaiconSportsIOSInstaller;
import com.iteso.factory.installer.impl.JamaiconStatsIOSInstaller;
import com.iteso.factory.installer.impl.JamaiconStoreIOSInstaller;
import com.iteso.factory.softProvider.JamaiconSoftProvider;

/**
 * Created by jorge on 18/03/16.
 */
public class JamaiconIOSSoftProvider extends JamaiconSoftProvider {
    @Override
    public JamaiconInstaller getJamaiconInstaller(String app) {
        if (app.equals("sports"))
            return new JamaiconSportsIOSInstaller();
        else if (app.equals("stats"))
            return new JamaiconStatsIOSInstaller();
        else if (app.equals("store"))
            return new JamaiconStoreIOSInstaller();
        else if (app.equals("game"))
            return new JamaiconGameIOSInstaller();
        else
            return null;
    }
}
