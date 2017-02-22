package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6312.fishing.model.Angler;
/**
 * J-Unit test to confirm Angler class catchFish method
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class AnglerWhenCatchFish {

	/**
	 * Test catchFish with 0 fish to be caught
	 */
	@Test
	public void testAnglerCatchFish0() {
		Angler theAngler = new Angler();
		theAngler.catchFish(0);
		assertEquals(theAngler.getFishCaught(), 0, 0);
	}
	
	/**
	 * Test catchFish with 37 fish to be caught
	 */
	@Test
	public void testAnglerCatchFish37() {
		Angler theAngler = new Angler();
		theAngler.catchFish(37);
		assertEquals(theAngler.getFishCaught(), 37, 0);
	}

	/**
	 * Test catchFish run twice with 100 and 10 fish
	 */
	@Test
	public void testAnglerCatchFish110() {
		Angler theAngler = new Angler();
		theAngler.catchFish(100);
		theAngler.catchFish(10);
		assertEquals(theAngler.getFishCaught(), 110, 0);
	}
}
