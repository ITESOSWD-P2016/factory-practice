package com.iteso.factory.softproviders.impl;

import com.iteso.factory.installers.JamaiconInstaller;
import com.iteso.factory.installers.impl.iosinstallers.JamaiconGameIOSInstaller;
import com.iteso.factory.installers.impl.iosinstallers.JamaiconSportsIOSInstaller;
import com.iteso.factory.installers.impl.iosinstallers.JamaiconStatsIOSInstaller;
import com.iteso.factory.installers.impl.iosinstallers.JamaiconStoreIOSInstaller;
import com.iteso.factory.softproviders.JamaiconSoftProvider;

/**
 * Created by luis_ on 18/03/2016.
 */
public class JamaiconIosSoftProvider extends JamaiconSoftProvider {
    @Override
    public JamaiconInstaller getJamaiconInst(String app) {
        JamaiconInstaller jamaiconInstaller;


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
