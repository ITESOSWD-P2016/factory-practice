package com.iteso.factory.provider.impl;

import com.iteso.factory.installer.JamaiconInst;
import com.iteso.factory.installer.impl.JamaiconGameWindowsPhoneInst;
import com.iteso.factory.installer.impl.JamaiconSportsWindowsPhoneInst;
import com.iteso.factory.installer.impl.JamaiconStatsWindowsPhoneInst;
import com.iteso.factory.installer.impl.JamaiconStoreWindowsPhoneInst;
import com.iteso.factory.provider.JamaiconSoftProvider;

public class JamaiconWindowsPhoneSoftProvider extends JamaiconSoftProvider {

	@Override
	public JamaiconInst getJamaiconInst(String app) {
		if (app.equals("sports"))
            return new JamaiconSportsWindowsPhoneInst();
        else if (app.equals("stats"))
            return new JamaiconStatsWindowsPhoneInst();
        else if (app.equals("store"))
        	return new JamaiconStoreWindowsPhoneInst();
        else if (app.equals("game"))
        	return new JamaiconGameWindowsPhoneInst();
        else
        	return null;
	}

}
