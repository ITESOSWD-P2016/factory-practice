package com.iteso.factory.softProvider.impl;

import com.iteso.factory.installer.JamaiconInstaller;
import com.iteso.factory.installer.impl.*;

/**
 * Created by Sabino on 18/03/2016.
 */
public class JamiconWindowsSoftProvider {
    public JamaiconInstaller getJamaiconInst(String app){
        if (app.equals("sports"))
            return new JamaiconSportsWindowsInstaller();
        else if (app.equals("stats"))
            return new JamaiconStatsWindowsInstaller();
        else if (app.equals("store"))
            return new JamaiconStoreWindowsInstaller();
        else if (app.equals("game"))
            return new JamaiconGameWindowsInstaller();
        else
            return null;
    }
}
