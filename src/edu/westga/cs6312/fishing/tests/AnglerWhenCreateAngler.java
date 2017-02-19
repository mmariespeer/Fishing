package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;

public class AnglerWhenCreateAngler {

	@Test
	public void testAnglerConstructToString() {
		Angler theAngler = new Angler();
		assertEquals(theAngler.toString(), "The angler with 100 money units and 0 fish");
	}

}
