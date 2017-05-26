package tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import drone.Cube;

public class FlySpaceTest {
	
	@Test
	public void nullTest(){
		FlySpace fly = new FlySpace();
		assertNotNull(fly);
	}
	
	

}
