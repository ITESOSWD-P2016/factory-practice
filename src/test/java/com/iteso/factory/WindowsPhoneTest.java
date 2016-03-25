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

        assertEquals("Sports WindowsPhone", jWindowsPhone.getJamaiconInst("sports").getCurrentInst());
    }
	
	@Test
	public void testWhenAppEqualsGame(){

        assertEquals("Game WindowsPhone", jWindowsPhone.getJamaiconInst("game").getCurrentInst());
    }
	
	@Test
	public void testWhenAppEqualsStats(){

        assertEquals("Stats WindowsPhone", jWindowsPhone.getJamaiconInst("stats").getCurrentInst());
    }
	
	@Test
	public void testWhenAppEqualsStore(){

        assertEquals("Store WindowsPhone", jWindowsPhone.getJamaiconInst("store").getCurrentInst());
    }
}
