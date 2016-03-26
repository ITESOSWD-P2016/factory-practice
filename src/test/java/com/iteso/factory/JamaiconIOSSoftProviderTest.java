package com.iteso.factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.iteso.factory.installer.JamaiconInstaller;
import com.iteso.factory.installer.impl.JamaiconGameIOSInstaller;
import com.iteso.factory.installer.impl.JamaiconSportsIOSInstaller;
import com.iteso.factory.installer.impl.JamaiconStatsIOSInstaller;
import com.iteso.factory.installer.impl.JamaiconStoreIOSInstaller;
import com.iteso.factory.provider.impl.JamaiconIOSSoftProvider;
import static org.hamcrest.CoreMatchers.is;

public class JamaiconIOSSoftProviderTest {
    JamaiconIOSSoftProvider oSoftProvider;
    JamaiconInstaller oInstaller;

    @Before
    public void setUp(){
        oSoftProvider = new JamaiconIOSSoftProvider();
    }
    
    @Test
    public void testGameIOSInstaller(){
    	oInstaller = oSoftProvider.getJamaiconInstaller("game");
        assertThat(oInstaller,is(JamaiconGameIOSInstaller.class));
    }
    
    @Test
    public void testSportsIOSInstaller(){
    	oInstaller = oSoftProvider.getJamaiconInstaller("sports");
        assertThat(oInstaller,is(JamaiconSportsIOSInstaller.class));
    }
    
    @Test
    public void testStatsIOSInstaller(){
    	oInstaller = oSoftProvider.getJamaiconInstaller("stats");
        assertThat(oInstaller,is(JamaiconStatsIOSInstaller.class));
    }
    
    @Test
    public void testStoreIOSInstaller(){
    	oInstaller = oSoftProvider.getJamaiconInstaller("store");
        assertThat(oInstaller,is(JamaiconStoreIOSInstaller.class));
    }
}
