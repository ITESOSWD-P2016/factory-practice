package com.iteso.factory.softproviders;

import com.iteso.factory.installers.JamaiconInstaller;
import com.iteso.factory.installers.impl.androidinstallers.JamaiconGameAndroidInstaller;
import com.iteso.factory.installers.impl.androidinstallers.JamaiconSportsAndroidInstaller;
import com.iteso.factory.installers.impl.androidinstallers.JamaiconStatsAndroidInstaller;
import com.iteso.factory.installers.impl.androidinstallers.JamaiconStoreAndroidInstaller;
import com.iteso.factory.installers.impl.windowsinstallers.JamaiconGameWindowsInstaller;
import com.iteso.factory.installers.impl.windowsinstallers.JamaiconSportsWindowsInstaller;
import com.iteso.factory.installers.impl.windowsinstallers.JamaiconStatsWindowsInstaller;
import com.iteso.factory.installers.impl.windowsinstallers.JamaiconStoreWindowsInstaller;
import com.iteso.factory.softproviders.impl.JamaiconAndroidSoftProvider;
import com.iteso.factory.softproviders.impl.JamaiconWindowsSoftProvider;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class WindowsTest {
    JamaiconInstaller Prueba;
    JamaiconWindowsSoftProvider Windows;

    @Before
    public void setUp(){
        Windows = new JamaiconWindowsSoftProvider();
    }

    @Test
    public void testWhenAppEqualsSports(){
        Prueba = Windows.getJamaiconInst("sports");
        assertThat(Prueba,is(JamaiconSportsWindowsInstaller.class));
    }

    @Test
    public void testWhenAppEqualsGame(){
        Prueba = Windows.getJamaiconInst("game");
        assertThat(Prueba,is(JamaiconGameWindowsInstaller.class));
    }

    @Test
    public void testWhenAppEqualsStats(){
        Prueba = Windows.getJamaiconInst("stats");
        assertThat(Prueba,is(JamaiconStatsWindowsInstaller.class));
    }

    @Test
    public void testWhenAppEqualsStore(){
        Prueba = Windows.getJamaiconInst("store");
        assertThat(Prueba,is(JamaiconStoreWindowsInstaller.class));
    }
}