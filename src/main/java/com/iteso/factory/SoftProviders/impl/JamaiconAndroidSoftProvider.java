package com.iteso.factory.SoftProviders.impl;

import com.iteso.factory.Installers.JamaiconInstaller;
import com.iteso.factory.Installers.impl.Android.JamaiconGameAndroidInstaller;
import com.iteso.factory.Installers.impl.Android.JamaiconSportsAndroidInstaller;
import com.iteso.factory.Installers.impl.Android.JamaiconStatsAndroidInstaller;
import com.iteso.factory.Installers.impl.Android.JamaiconStoreAndroidInstaller;
import com.iteso.factory.SoftProviders.JamaiconSoftProvider;

/**
 * Created by ChaosInfinityViral on 18/03/16.
 */
public class JamaiconAndroidSoftProvider extends JamaiconSoftProvider {
    @Override
    public JamaiconInstaller getjamaiconInstaller(String app) {

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
