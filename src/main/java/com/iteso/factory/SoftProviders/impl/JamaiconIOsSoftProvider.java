package com.iteso.factory.SoftProviders.impl;

import com.iteso.factory.Installers.JamaiconInstaller;
import com.iteso.factory.Installers.impl.IOs.JamaiconGameIOSInstaller;
import com.iteso.factory.Installers.impl.IOs.JamaiconSportsIOSInstaller;
import com.iteso.factory.Installers.impl.IOs.JamaiconStatsIOSInstaller;
import com.iteso.factory.Installers.impl.IOs.JamaiconStoreIOSInstaller;
import com.iteso.factory.SoftProviders.JamaiconSoftProvider;

/**
 * Created by ChaosInfinityViral on 18/03/16.
 */
public class JamaiconIOsSoftProvider extends JamaiconSoftProvider {


    @Override
    public JamaiconInstaller getjamaiconInstaller(String app) {
        if (app.equals("sports"))
            return new JamaiconSportsIOSInstaller();
        else if (app.equals("stats"))
            return  new JamaiconStatsIOSInstaller();
        else if (app.equals("store"))
             return new JamaiconStoreIOSInstaller();
        else if (app.equals("game"))
            return new JamaiconGameIOSInstaller();
        else
            return null;
    }
}
