package com.iteso.factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.iteso.factory.installer.JamaiconInstaller;
import com.iteso.factory.installer.impl.JamaiconGameAndroidInstaller;
import com.iteso.factory.installer.impl.JamaiconSportsAndroidInstaller;
import com.iteso.factory.installer.impl.JamaiconStatsAndroidInstaller;
import com.iteso.factory.installer.impl.JamaiconStoreAndroidInstaller;
import com.iteso.factory.provider.impl.JamaiconAndroidSoftProvider;
import static org.hamcrest.CoreMatchers.is;

public class JamaiconAndroidSoftProviderTest {
    JamaiconAndroidSoftProvider oSoftProvider;
    JamaiconInstaller oInstaller;

    @Before
    public void setUp(){
        oSoftProvider = new JamaiconAndroidSoftProvider();
    }
    
    @Test
    public void testGameAndroidInstaller(){
    	oInstaller = oSoftProvider.getJamaiconInstaller("game");
        assertThat(oInstaller,is(JamaiconGameAndroidInstaller.class));
    }
    
    @Test
    public void testSportsAndroidInstaller(){
    	oInstaller = oSoftProvider.getJamaiconInstaller("sports");
        assertThat(oInstaller,is(JamaiconSportsAndroidInstaller.class));
    }
    
    @Test
    public void testStatsAndroidInstaller(){
    	oInstaller = oSoftProvider.getJamaiconInstaller("stats");
        assertThat(oInstaller,is(JamaiconStatsAndroidInstaller.class));
    }
    
    @Test
    public void testStoreAndroidInstaller(){
    	oInstaller = oSoftProvider.getJamaiconInstaller("store");
        assertThat(oInstaller,is(JamaiconStoreAndroidInstaller.class));
    }
}
