package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;
/**
 * J-unit test to confirm SmallFish class constructor and toString
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class SmallFishWhenCreateSmallFish {

	/**
	 * Test the 0-parameter constructor and toString method
	 */
	@Test
	public void testSmallFishConstructToString() {
		SmallFish theSmallFish = new SmallFish();
		assertEquals(theSmallFish.toString(), "small fish with 100 fish in the school");
	}

}
