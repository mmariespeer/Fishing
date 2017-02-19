package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6312.fishing.model.Angler;

public class AnglerWhenGetMoney {

	@Test
	public void testAnglerGetMoney() {
		Angler theAngler = new Angler();
		assertEquals(theAngler.getMoneyLeft(), 100, 0);
	}

}
