package com.iteso.factory.provider.impl;

import com.iteso.factory.installer.impl.JamaiconGameIOSInstaller;
import com.iteso.factory.installer.JamaiconInstaller;
import com.iteso.factory.installer.impl.JamaiconSportsIOSInstaller;
import com.iteso.factory.installer.impl.JamaiconStatsIOSInstaller;
import com.iteso.factory.installer.impl.JamaiconStoreIOSInstaller;
import com.iteso.factory.provider.JamaiconSoftProvider;

public class JamaiconIOSSoftProvider extends JamaiconSoftProvider {

	public JamaiconInstaller getJamaiconInst(String app) {
		
	            if (app.equals("sports"))
	                return new JamaiconSportsIOSInstaller();
	            else if (app.equals("stats"))
	                return new JamaiconStatsIOSInstaller();
	            else if (app.equals("store"))
	                return new JamaiconStoreIOSInstaller();
	            else if (app.equals("game"))
	                return new JamaiconGameIOSInstaller();
	            else
	                return null;
	}

}
