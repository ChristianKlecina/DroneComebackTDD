package tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import drone.Cube;

public class FlySpaceTest {
	
	@Test
	public void nullTest(){
		Cube veca = new Cube(0, 50);
		Cube manja = new Cube(10, 40);
		FlySpace fly = new FlySpace(Cube manja, Cube veca);
		assertNotNull(fly);
	}
	
	

}
