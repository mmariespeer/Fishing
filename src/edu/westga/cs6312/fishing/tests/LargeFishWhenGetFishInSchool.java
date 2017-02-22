package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;
/**
 * J-Unit test to confirm LargeFish class getFishInSchool method
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class LargeFishWhenGetFishInSchool {

	/**
	 * Test the getFishInSchool method with initial amount of 50
	 */
	@Test
	public void testLargeFishGetterMethod() {
		LargeFish theLargeFish = new LargeFish();
		assertEquals(theLargeFish.getFishInSchool(), 50, 0);
	}
	
	/**
	 * Test the getFishInSchool method with initial amount of 50 with removeFish method (10)
	 * Cannot use catchFish method to test as it is random
	 */
	@Test
	public void testLargeFishGetterMethodRemoveFish() {
		LargeFish theLargeFish = new LargeFish();
		theLargeFish.removeFish(10);
		assertEquals(theLargeFish.getFishInSchool(), 40, 0);
	}
	
	

}
