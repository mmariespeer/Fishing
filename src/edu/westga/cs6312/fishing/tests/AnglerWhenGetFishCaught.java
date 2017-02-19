package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.Angler;

public class AnglerWhenGetFishCaught {

	@Test
	public void test() {
		Angler theAngler = new Angler();
		assertEquals(theAngler.getFishCaught(), 0, 0);
	}

}
