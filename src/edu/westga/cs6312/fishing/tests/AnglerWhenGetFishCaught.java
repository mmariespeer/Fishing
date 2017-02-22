package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.Angler;
/**
 * J-unit test to confirm Angler class getFishCaught method
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class AnglerWhenGetFishCaught {
	/**
	 * Test getFishCaught method with initial amount of zero
	 */
	@Test
	public void testCatchFish() {
		Angler theAngler = new Angler();
		assertEquals(theAngler.getFishCaught(), 0, 0);
	}
	
	/**
	 * Test getFishCaught method with added fish 37
	 */
	@Test
	public void testCatchFish37() {
		Angler theAngler = new Angler();
		theAngler.catchFish(37);
		assertEquals(theAngler.getFishCaught(), 37, 0);
	}
	
	/**
	 * Test getFishCaught method with added fish 100
	 */
	@Test
	public void testCatchFish100() {
		Angler theAngler = new Angler();
		theAngler.catchFish(50);
		theAngler.catchFish(50);
		assertEquals(theAngler.getFishCaught(), 100, 0);
	}

}
