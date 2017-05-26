package tests;

import org.junit.Test;

import drone.Cube;

import static org.junit.Assert.*;

public class CubeTest {
	
	@Test
	public void notNull(){
		
		Cube cube = new Cube({0,0,0},{50,50,50});
		assertNotNull(cube);
	}

}
