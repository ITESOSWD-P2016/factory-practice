package com.iteso.factory.softProvider.impl;

import com.iteso.factory.installer.JamaiconInstaller;
import com.iteso.factory.installer.impl.JamaiconGameAndroidInstaller;
import com.iteso.factory.installer.impl.JamaiconSportsAndroidInstaller;
import com.iteso.factory.installer.impl.JamaiconStatsAndroidInstaller;
import com.iteso.factory.installer.impl.JamaiconStoreAndroidInstaller;
import com.iteso.factory.softProvider.JamaiconSoftProvider;

/**
 * Created by Sabino on 18/03/2016.
 */
public class JamaiconAndroidSoftProvider extends JamaiconSoftProvider{
    public JamaiconInstaller getJamaiconInst(String app){
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
