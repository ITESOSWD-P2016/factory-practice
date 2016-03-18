package com.iteso.factory.providers.impl;

import com.iteso.factory.JamaiconInstaller;
import com.iteso.factory.installers.JamaiconGameIOSInstaller;
import com.iteso.factory.installers.JamaiconSportsIOSInstaller;
import com.iteso.factory.installers.JamaiconStatsIOSInstaller;
import com.iteso.factory.installers.JamaiconStoreIOSInstaller;
import com.iteso.factory.providers.JamaiconSoftProvider;

/**
 * Created by User on 18/03/2016.
 */
public class JamaiconIOSSoftProvider extends JamaiconSoftProvider {



    @Override
    public JamaiconInstaller getJamaiconInstaller(String app) {
        JamaiconInstaller jamaiconInstaller;
            if (app.equals("sports"))
                jamaiconInstaller = new JamaiconSportsIOSInstaller();
            else if (app.equals("stats"))
                jamaiconInstaller = new JamaiconStatsIOSInstaller();
            else if (app.equals("store"))
                jamaiconInstaller = new JamaiconStoreIOSInstaller();
            else if (app.equals("game"))
                jamaiconInstaller = new JamaiconGameIOSInstaller();
            else
                jamaiconInstaller = null;

        return jamaiconInstaller;
}


}
