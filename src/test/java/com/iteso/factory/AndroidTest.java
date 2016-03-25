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

        assertEquals("Sports Android", jAndroid.getJamaiconInst("sports").getCurrentInst());
    }
	
	@Test
	public void testWhenAppEqualsGame(){

        assertEquals("Game Android", jAndroid.getJamaiconInst("game").getCurrentInst());
    }
	
	@Test
	public void testWhenAppEqualsStats(){

        assertEquals("Stats Android", jAndroid.getJamaiconInst("stats").getCurrentInst());
    }
	
	@Test
	public void testWhenAppEqualsStore(){

        assertEquals("Store Android", jAndroid.getJamaiconInst("store").getCurrentInst());
    }
}
