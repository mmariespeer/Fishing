package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;
/**
 * J-Unit test to confirm SmallFish class getFishInSchool method
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class SmallFishWhenGetFishInSchool {

	/**
	 * Test the getFishInSchool method with initial amount of 100
	 */
	@Test
	public void testSmallFishGetterMethod() {
		SmallFish theSmallFish = new SmallFish();
		assertEquals(theSmallFish.getFishInSchool(), 100, 0);
	}
	
	/**
	 * Test the getFishInSchool method after catchFish method (should be 50)
	 */
	@Test
	public void testSmallFishGetterMethodRemoved() {
		SmallFish theSmallFish = new SmallFish();
		theSmallFish.catchFish();
		assertEquals(theSmallFish.getFishInSchool(), 50, 0);
	}

}
