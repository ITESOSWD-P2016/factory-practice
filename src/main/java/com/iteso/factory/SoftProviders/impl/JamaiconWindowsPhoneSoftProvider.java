package com.iteso.factory.SoftProviders.impl;

import com.iteso.factory.Installers.JamaiconInstaller;
import com.iteso.factory.Installers.impl.WindowsPhone.JamaiconGameWindowsPhoneInstaller;
import com.iteso.factory.Installers.impl.WindowsPhone.JamaiconSportsWindowsPhoneInstaller;
import com.iteso.factory.Installers.impl.WindowsPhone.JamaiconStatsWindowsPhoneInstaller;
import com.iteso.factory.Installers.impl.WindowsPhone.JamaiconStoreWindowsPhoneInstaller;
import com.iteso.factory.SoftProviders.JamaiconSoftProvider;

/**
 * Created by ChaosInfinityViral on 18/03/16.
 */
public class JamaiconWindowsPhoneSoftProvider extends JamaiconSoftProvider {
    @Override
    public JamaiconInstaller getjamaiconInstaller(String app) {

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
