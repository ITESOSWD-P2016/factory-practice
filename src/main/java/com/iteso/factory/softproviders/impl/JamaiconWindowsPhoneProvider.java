package com.iteso.factory.softproviders.impl;

import com.iteso.factory.installers.JamaiconInstaller;
import com.iteso.factory.installers.impl.games.JamaiconGameWindowsPhoneInstaller;
import com.iteso.factory.installers.impl.sports.JamaiconSportsWindowsPhoneInstaller;
import com.iteso.factory.installers.impl.stats.JamaiconStatsWindowsPhoneInstaller;
import com.iteso.factory.installers.impl.stores.JamaiconStoreWindowsPhoneInstaller;
import com.iteso.factory.softproviders.JamaiconSoftProvider;

/**
 * Created by lnvitado on 18/03/2016.
 */
public class JamaiconWindowsPhoneProvider extends JamaiconSoftProvider {
    @Override
    public JamaiconInstaller getJamaiconInstaller(String app) {
        if (app.equals("sports"))
            return new JamaiconSportsWindowsPhoneInstaller();
        else if (app.equals("stats"))
            return new JamaiconStatsWindowsPhoneInstaller();
        else if (app.equals("store"))
            return new JamaiconStoreWindowsPhoneInstaller();
        else if (app.equals("game"))
            return new JamaiconGameWindowsPhoneInstaller();
        else
            return null;
    }
}
