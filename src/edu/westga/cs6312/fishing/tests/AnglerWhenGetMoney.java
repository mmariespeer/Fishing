package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6312.fishing.model.Angler;
/**
 * J-unit test to confirm Angler class getMoney method
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class AnglerWhenGetMoney {
	/**
	 * Test to confirm getMoney initial amount of 100
	 */
	@Test
	public void testAnglerGetMoney100() {
		Angler theAngler = new Angler();
		assertEquals(theAngler.getMoneyLeft(), 100, 0);
	}
	
	/**
	 * Test to confirm getMoney after pay to fish
	 */
	@Test
	public void testAnglerGetMoney() {
		Angler theAngler = new Angler();
		theAngler.payToFish(29);
		assertEquals(theAngler.getMoneyLeft(), 71, 0);
	}

}
