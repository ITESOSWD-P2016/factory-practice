package com.iteso.factory.softproviders;

import com.iteso.factory.installers.JamaiconInstaller;
import com.iteso.factory.installers.impl.androidinstallers.JamaiconGameAndroidInstaller;
import com.iteso.factory.installers.impl.androidinstallers.JamaiconSportsAndroidInstaller;
import com.iteso.factory.installers.impl.androidinstallers.JamaiconStatsAndroidInstaller;
import com.iteso.factory.installers.impl.androidinstallers.JamaiconStoreAndroidInstaller;
import com.iteso.factory.installers.impl.iosinstallers.JamaiconGameIOSInstaller;
import com.iteso.factory.installers.impl.iosinstallers.JamaiconSportsIOSInstaller;
import com.iteso.factory.installers.impl.iosinstallers.JamaiconStatsIOSInstaller;
import com.iteso.factory.installers.impl.iosinstallers.JamaiconStoreIOSInstaller;
import com.iteso.factory.softproviders.impl.JamaiconAndroidSoftProvider;
import com.iteso.factory.softproviders.impl.JamaiconIosSoftProvider;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class IOSTest {
    JamaiconInstaller Prueba;
    JamaiconIosSoftProvider IOS;

    @Before
    public void setUp(){
        IOS= new JamaiconIosSoftProvider();
    }

    @Test
    public void testWhenAppEqualsSports(){
        Prueba = IOS.getJamaiconInst("sports");
        assertThat(Prueba,is(JamaiconSportsIOSInstaller.class));
    }

    @Test
    public void testWhenAppEqualsGame(){
        Prueba = IOS.getJamaiconInst("game");
        assertThat(Prueba,is(JamaiconGameIOSInstaller.class));
    }

    @Test
    public void testWhenAppEqualsStats(){
        Prueba = IOS.getJamaiconInst("stats");
        assertThat(Prueba,is(JamaiconStatsIOSInstaller.class));
    }

    @Test
    public void testWhenAppEqualsStore(){
        Prueba = IOS.getJamaiconInst("store");
        assertThat(Prueba,is(JamaiconStoreIOSInstaller.class));
    }
}