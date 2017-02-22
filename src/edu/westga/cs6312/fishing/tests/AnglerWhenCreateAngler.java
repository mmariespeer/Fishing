package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;
/**
 * J-unit test to confirm Angler class constructor
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class AnglerWhenCreateAngler {

	/**
	 * Test the angler's 0-parameter constructor
	 */
	@Test
	public void testAnglerConstructToString() {
		Angler theAngler = new Angler();
		assertEquals(theAngler.toString(), "The angler with 100 money units and 0 fish");
	}

}
