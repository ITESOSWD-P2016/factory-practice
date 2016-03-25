package com.iteso.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.iteso.factory.provider.impl.JamaiconWindowsPhoneSoftProvider;

public class WindowsPhoneTest {

JamaiconWindowsPhoneSoftProvider jWindowsPhone;
	
	@Before
	public void setUp(){
        jWindowsPhone = new JamaiconWindowsPhoneSoftProvider();
    }
	
	@Test
	public void testWhenAppEqualsSports(){

        assertEquals("I´m a Jamaicon Sports WindowsPhone Installer", jWindowsPhone.getJamaiconInstaller("sports").getCurrentInstaller());
    }
	
	@Test
	public void testWhenAppEqualsGame(){

        assertEquals("I´m a Jamaicon Game WindowsPhone Installer", jWindowsPhone.getJamaiconInstaller("game").getCurrentInstaller());
    }
	
	@Test
	public void testWhenAppEqualsStats(){

        assertEquals("I´m a Jamaicon Stats WindowsPhone Installer", jWindowsPhone.getJamaiconInstaller("stats").getCurrentInstaller());
    }
	
	@Test
	public void testWhenAppEqualsStore(){

        assertEquals("I´m a Jamaicon Store WindowsPhone Installer", jWindowsPhone.getJamaiconInstaller("store").getCurrentInstaller());
    }
}
