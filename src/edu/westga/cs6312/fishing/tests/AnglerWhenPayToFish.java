package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6312.fishing.model.Angler;
/**
 * J-unit tests to confirm Angler class payToFish method
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class AnglerWhenPayToFish {
	
	/**
	 * Test payToFish method when cost is 0
	 */
	@Test
	public void testAnglerPayToFishLow() {
		Angler theAngler = new Angler();
		theAngler.payToFish(0);
		assertEquals(theAngler.getMoneyLeft(), 100, 0);
	}
	
	/**
	 * Test payToFish method when cost is 100
	 */
	@Test
	public void testAnglerPayToFishHigh() {
		Angler theAngler = new Angler();
		theAngler.payToFish(100);
		assertEquals(theAngler.getMoneyLeft(), 0, 0);
	}
	
	/**
	 * Test payToFish method when cost is 50
	 */
	@Test
	public void testAnglerPayToFishMiddle() {
		Angler theAngler = new Angler();
		theAngler.payToFish(50);
		assertEquals(theAngler.getMoneyLeft(), 50, 0);
	}
	
	/**
	 * Test payToFish method when cost is 37
	 */
	@Test
	public void testAnglerPayToFishRandom() {
		Angler theAngler = new Angler();
		theAngler.payToFish(30);
		theAngler.payToFish(7);
		assertEquals(theAngler.getMoneyLeft(), 63, 0);
	}

}
