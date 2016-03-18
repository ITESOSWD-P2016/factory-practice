package com.iteso.factory.providers.impl;

import com.iteso.factory.JamaiconInstaller;
import com.iteso.factory.installers.JamaiconGameAndroidInstaller;
import com.iteso.factory.installers.JamaiconSportsAndroidInstaller;
import com.iteso.factory.installers.JamaiconStatsAndroidInstaller;
import com.iteso.factory.installers.JamaiconStoreAndroidInstaller;
import com.iteso.factory.providers.JamaiconSoftProvider;

/**
 * Created by User on 18/03/2016.
 */
public class JamaiconAndoidSoftProvider extends JamaiconSoftProvider {


    @Override
    public JamaiconInstaller getJamaiconInstaller(String app) {

        JamaiconInstaller jamaiconInstaller;

            if (app.equals("sports"))
                jamaiconInstaller = new JamaiconSportsAndroidInstaller();
            else if (app.equals("stats"))
                jamaiconInstaller = new JamaiconStatsAndroidInstaller();
            else if (app.equals("store"))
                jamaiconInstaller = new JamaiconStoreAndroidInstaller();
            else if (app.equals("game"))
                jamaiconInstaller = new JamaiconGameAndroidInstaller();
            else
                jamaiconInstaller = null;

        return jamaiconInstaller;
    }
}
