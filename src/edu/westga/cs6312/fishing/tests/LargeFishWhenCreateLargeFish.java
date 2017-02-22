package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;
/**
 * J-unit test to confirm LargeFish class constructor and toString
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class LargeFishWhenCreateLargeFish {

	/**
	 * Test the 0-parameter constructor and toString method
	 */
	@Test
	public void testLargeFishConstructToString() {
		LargeFish theLargeFish = new LargeFish();
		assertEquals(theLargeFish.toString(), "large fish with 50 fish in the school");
	}

}

