package com.iteso.factory.provider.impl;

import com.iteso.factory.installer.JamaiconInst;
import com.iteso.factory.installer.impl.JamaiconGameIOSInst;
import com.iteso.factory.installer.impl.JamaiconSportsIOSInst;
import com.iteso.factory.installer.impl.JamaiconStatsIOSInst;
import com.iteso.factory.installer.impl.JamaiconStoreIOSInst;
import com.iteso.factory.provider.JamaiconSoftProvider;

public class JamaiconIOSSoftProvider extends JamaiconSoftProvider {

	public JamaiconInst getJamaiconInst(String app) {
		
	            if (app.equals("sports"))
	                return new JamaiconSportsIOSInst();
	            else if (app.equals("stats"))
	                return new JamaiconStatsIOSInst();
	            else if (app.equals("store"))
	                return new JamaiconStoreIOSInst();
	            else if (app.equals("game"))
	                return new JamaiconGameIOSInst();
	            else
	                return null;
	}

}
