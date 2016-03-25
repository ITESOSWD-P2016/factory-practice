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

        assertEquals("Sports IOS", jIOS.getJamaiconInst("sports").getCurrentInst());
    }
	
	@Test
	public void testWhenAppEqualsGame(){

        assertEquals("Game IOS", jIOS.getJamaiconInst("game").getCurrentInst());
    }
	
	@Test
	public void testWhenAppEqualsStats(){

        assertEquals("Stats IOS", jIOS.getJamaiconInst("stats").getCurrentInst());
    }
	
	@Test
	public void testWhenAppEqualsStore(){

        assertEquals("Store IOS", jIOS.getJamaiconInst("store").getCurrentInst());
    }

}
