package com.iteso.factory.provider.impl;

import com.iteso.factory.installer.JamaiconInst;
import com.iteso.factory.installer.impl.JamaiconGameAndroidInst;
import com.iteso.factory.installer.impl.JamaiconSportsAndroidInst;
import com.iteso.factory.installer.impl.JamaiconStatsAndroidInst;
import com.iteso.factory.installer.impl.JamaiconStoreAndroidInst;
import com.iteso.factory.provider.JamaiconSoftProvider;

public class JamaiconAndroidSoftProvider extends JamaiconSoftProvider {

	public JamaiconInst getJamaiconInst(String app) {
            if (app.equals("sports"))
                return new JamaiconSportsAndroidInst();
            else if (app.equals("stats"))
                return new JamaiconStatsAndroidInst();
            else if (app.equals("store"))
            	return new JamaiconStoreAndroidInst();
            else if (app.equals("game"))
            	return new JamaiconGameAndroidInst();
            else
            	return null;
	}

}
