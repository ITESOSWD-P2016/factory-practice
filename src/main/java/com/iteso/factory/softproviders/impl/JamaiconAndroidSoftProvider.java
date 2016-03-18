package com.iteso.factory.softproviders.impl;

import com.iteso.factory.installers.impl.games.JamaiconGameAndroidInstaller;
import com.iteso.factory.installers.impl.sports.JamaiconSportsAndroidInstaller;
import com.iteso.factory.installers.impl.stats.JamaiconStatsAndroidInstaller;
import com.iteso.factory.installers.impl.stores.JamaiconStoreAndroidInstaller;
import com.iteso.factory.installers.JamaiconInstaller;
import com.iteso.factory.softproviders.JamaiconSoftProvider;

/**
 * Created by lnvitado on 18/03/2016.
 */
public class JamaiconAndroidSoftProvider extends JamaiconSoftProvider {

    @Override
    public JamaiconInstaller getJamaiconInstaller(String app) {
        if (app.equals("sports"))
            return new JamaiconSportsAndroidInstaller();
        else if (app.equals("stats"))
            return new JamaiconStatsAndroidInstaller();
        else if (app.equals("store"))
            return new JamaiconStoreAndroidInstaller();
        else if (app.equals("game"))
            return new JamaiconGameAndroidInstaller();
        else
            return null;
    }
}
