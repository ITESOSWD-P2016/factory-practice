package com.iteso.factory.softproviders;

import com.iteso.factory.installers.JamaiconInstaller;
import com.iteso.factory.installers.impl.androidinstallers.JamaiconGameAndroidInstaller;
import com.iteso.factory.installers.impl.androidinstallers.JamaiconSportsAndroidInstaller;
import com.iteso.factory.installers.impl.androidinstallers.JamaiconStatsAndroidInstaller;
import com.iteso.factory.installers.impl.androidinstallers.JamaiconStoreAndroidInstaller;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.iteso.factory.softproviders.impl.JamaiconAndroidSoftProvider;


public class AndroidTest {
    JamaiconInstaller Prueba;
    JamaiconAndroidSoftProvider Android;

    @Before
    public void setUp(){
        Android = new JamaiconAndroidSoftProvider();
    }

    @Test
    public void testWhenAppEqualsSports(){
        Prueba = Android.getJamaiconInst("sports");
        assertThat(Prueba,is(JamaiconSportsAndroidInstaller.class));
    }

    @Test
    public void testWhenAppEqualsGame(){
        Prueba = Android.getJamaiconInst("game");
        assertThat(Prueba,is(JamaiconGameAndroidInstaller.class));
    }

    @Test
    public void testWhenAppEqualsStats(){
        Prueba = Android.getJamaiconInst("stats");
        assertThat(Prueba,is(JamaiconStatsAndroidInstaller.class));
    }

    @Test
    public void testWhenAppEqualsStore(){
        Prueba = Android.getJamaiconInst("store");
        assertThat(Prueba,is(JamaiconStoreAndroidInstaller.class));
    }
}