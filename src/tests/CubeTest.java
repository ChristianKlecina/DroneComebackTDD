package tests;

import org.junit.Test;

import drone.Cube;

import static org.junit.Assert.*;

public class CubeTest {
	
	@Test
	public void notNull(){
		
		int[] pocetna = {0,0,0};
		int[] krajnja = {50,50,50};
		
		Cube cube = new Cube (int[] pocetna,int[] krajnja);
		assertNotNull(cube);
	}

}
