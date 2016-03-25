package com.iteso.factory;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.iteso.factory.provider.impl.JamaiconIOSSoftProvider;


public class IOSTest {
	
	JamaiconIOSSoftProvider jIOS;
	
	@Before
	public void setUp(){
        jIOS = new JamaiconIOSSoftProvider();
    }
	
	@Test
	public void testWhenAppEqualsSports(){

        assertEquals("I´m a Jamaicon Sports IOS Installer", jIOS.getJamaiconInstaller("sports").getCurrentInstaller());
    }
	
	@Test
	public void testWhenAppEqualsGame(){

        assertEquals("I´m a Jamaicon Game IOS Installer", jIOS.getJamaiconInstaller("game").getCurrentInstaller());
    }
	
	@Test
	public void testWhenAppEqualsStats(){

        assertEquals("I´m a Jamaicon Stats IOS Installer", jIOS.getJamaiconInstaller("stats").getCurrentInstaller());
    }
	
	@Test
	public void testWhenAppEqualsStore(){

        assertEquals("I´m a Jamaicon Store IOS Installer", jIOS.getJamaiconInstaller("store").getCurrentInstaller());
    }

}
