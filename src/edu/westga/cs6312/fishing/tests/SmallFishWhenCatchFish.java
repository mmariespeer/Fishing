package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;
/**
 * J-Unit test to confirm SmallFish catchFish method
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class SmallFishWhenCatchFish {

	/**
	 * Test the SmallFish catchFish method which should remove 50 fish from school
	 */
	@Test
	public void testSmallFishCatchFish() {
		SmallFish theSmallFish = new SmallFish();
		theSmallFish.catchFish();
		assertEquals(theSmallFish.getFishInSchool(), 50, 0);
	}
	
	/**
	 * Test the SmallFish catchFish method which should remove 100 fish from school
	 */
	@Test
	public void testSmallFishCatchFishTwice() {
		SmallFish theSmallFish = new SmallFish();
		theSmallFish.catchFish();
		theSmallFish.catchFish();
		assertEquals(theSmallFish.getFishInSchool(), 0, 0);
	}

}
