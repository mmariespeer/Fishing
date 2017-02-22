package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;
/**
 * J-unit test to confirm SmallFish class getCostToFish method
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class SmallFishWhenGetCostToFish {

	/**
	 * Test the getCostToFish method, should be 25 money units
	 */
	@Test
	public void testSmallFishCostToFish() {
		SmallFish theSmallFish = new SmallFish();
		assertEquals(theSmallFish.costToFish(), 25, 0);
	}

}
