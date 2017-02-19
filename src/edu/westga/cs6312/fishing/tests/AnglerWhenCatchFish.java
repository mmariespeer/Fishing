package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6312.fishing.model.Angler;

public class AnglerWhenCatchFish {

	@Test
	public void testAnglerCatchFish0() {
		Angler theAngler = new Angler();
		theAngler.catchFish(0);
		assertEquals(theAngler.getFishCaught(), 0, 0);
	}
	
	@Test
	public void testAnglerCatchFish37() {
		Angler theAngler = new Angler();
		theAngler.catchFish(37);
		assertEquals(theAngler.getFishCaught(), 37, 0);
	}

	@Test
	public void testAnglerCatchFish100() {
		Angler theAngler = new Angler();
		theAngler.catchFish(100);
		assertEquals(theAngler.getFishCaught(), 100, 0);
	}
}
