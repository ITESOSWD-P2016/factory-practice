package com.iteso.factory.softproviders.impl;

import com.iteso.factory.installers.impl.sports.JamaiconSportsIOSInstaller;
import com.iteso.factory.installers.impl.stats.JamaiconStatsIOSInstaller;
import com.iteso.factory.installers.JamaiconInstaller;
import com.iteso.factory.installers.impl.games.JamaiconGameIOSInstaller;
import com.iteso.factory.installers.impl.stores.JamaiconStoreIOSInstaller;
import com.iteso.factory.softproviders.JamaiconSoftProvider;

/**
 * Created by lnvitado on 18/03/2016.
 */
public class JamaiconiOSSoftProvider extends JamaiconSoftProvider {
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
