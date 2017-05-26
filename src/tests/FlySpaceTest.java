package tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import drone.Cube;
import drone.FlySpace;

public class FlySpaceTest {
	
	@Test
	public void nullTest(){
		
		int[] pocetna = {0,0,0};
		int[] krajnja = {50,50,50};
		
		Cube veca = new Cube(pocetna, krajnja);
		Cube manja = new Cube(pocetna, krajnja);
		
	}
	
	

}
