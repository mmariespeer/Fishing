package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;
/**
 * J-unit test to confirm LargeFish class getCostToFish method
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class LargeFishWhenGetCostToFish {

	/**
	 * Test the getCostToFish method, should be 50 money units
	 */
	@Test
	public void testSmallFishCostToFish() {
		LargeFish theLargeFish = new LargeFish();
		assertEquals(theLargeFish.costToFish(), 50, 0);
	}

}