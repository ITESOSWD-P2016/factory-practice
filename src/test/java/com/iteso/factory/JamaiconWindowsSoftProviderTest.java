package com.iteso.factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.iteso.factory.installer.JamaiconInstaller;
import com.iteso.factory.installer.impl.JamaiconGameWindowsInstaller;
import com.iteso.factory.installer.impl.JamaiconSportsWindowsInstaller;
import com.iteso.factory.installer.impl.JamaiconStatsWindowsInstaller;
import com.iteso.factory.installer.impl.JamaiconStoreWindowsInstaller;
import com.iteso.factory.provider.impl.JamaiconWindowsSoftProvider;
import static org.hamcrest.CoreMatchers.is;

public class JamaiconWindowsSoftProviderTest {
    JamaiconWindowsSoftProvider oSoftProvider;
    JamaiconInstaller oInstaller;

    @Before
    public void setUp(){
        oSoftProvider = new JamaiconWindowsSoftProvider();
    }
    
    @Test
    public void testGameWindowsInstaller(){
    	oInstaller = oSoftProvider.getJamaiconInstaller("game");
        assertThat(oInstaller,is(JamaiconGameWindowsInstaller.class));
    }
    
    @Test
    public void testSportsWindowsInstaller(){
    	oInstaller = oSoftProvider.getJamaiconInstaller("sports");
        assertThat(oInstaller,is(JamaiconSportsWindowsInstaller.class));
    }
    
    @Test
    public void testStatsWindowsInstaller(){
    	oInstaller = oSoftProvider.getJamaiconInstaller("stats");
        assertThat(oInstaller,is(JamaiconStatsWindowsInstaller.class));
    }
    
    @Test
    public void testStoreWindowsInstaller(){
    	oInstaller = oSoftProvider.getJamaiconInstaller("store");
        assertThat(oInstaller,is(JamaiconStoreWindowsInstaller.class));
    }
}
