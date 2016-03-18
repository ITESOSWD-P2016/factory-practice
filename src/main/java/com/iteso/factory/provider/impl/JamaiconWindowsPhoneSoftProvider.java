package com.iteso.factory.provider.impl;

import com.iteso.factory.installer.impl.JamaiconGameWindowsPhoneInstaller;
import com.iteso.factory.installer.JamaiconInstaller;
import com.iteso.factory.installer.impl.JamaiconSportsWindowsPhoneInstaller;
import com.iteso.factory.installer.impl.JamaiconStatsWindowsPhoneInstaller;
import com.iteso.factory.installer.impl.JamaiconStoreWindowsPhoneInstaller;
import com.iteso.factory.provider.JamaiconSoftProvider;

public class JamaiconWindowsPhoneSoftProvider extends JamaiconSoftProvider {

	@Override
	public JamaiconInstaller getJamaiconInst(String app) {
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
