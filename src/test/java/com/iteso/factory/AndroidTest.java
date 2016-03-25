package com.iteso.factory;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.iteso.factory.provider.impl.JamaiconAndroidSoftProvider;


public class AndroidTest {

	JamaiconAndroidSoftProvider jAndroid;
	
	@Before
	public void setUp(){
        jAndroid = new JamaiconAndroidSoftProvider();
    }
	
	@Test
	public void testWhenAppEqualsSports(){

        assertEquals("I´m a Jamaicon Sports Android Installer", jAndroid.getJamaiconInstaller("sports").getCurrentInstaller());
    }
	
	@Test
	public void testWhenAppEqualsGame(){

        assertEquals("I´m a Jamaicon Game Android Installer", jAndroid.getJamaiconInstaller("game").getCurrentInstaller());
    }
	
	@Test
	public void testWhenAppEqualsStats(){

        assertEquals("I´m a Jamaicon Stats Android Installer", jAndroid.getJamaiconInstaller("stats").getCurrentInstaller());
    }
	
	@Test
	public void testWhenAppEqualsStore(){

        assertEquals("I´m a Jamaicon Store Android Installer", jAndroid.getJamaiconInstaller("store").getCurrentInstaller());
    }
}
