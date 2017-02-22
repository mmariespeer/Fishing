package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;
/**
 * J-Unit test to confirm FishingHole class getLocation method
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class FishingHoleWhenGetLocation {

	/**
	 * Test fishing hole constructor and getLocation at 0
	 */
	@Test
	public void testCreateFishHoleGetLocation() {
		FishingHole theFishingHole = new FishingHole(0);
		assertEquals(theFishingHole.getLocation(), "Fishing hole at [0]");
	}
	
	/**
	 * Test fishing hole constructor and getLocation at 10
	 */
	@Test
	public void testCreateFishHoleGetLocation10() {
		FishingHole theFishingHole = new FishingHole(10);
		assertEquals(theFishingHole.getLocation(), "Fishing hole at [10]");
	}
	
	/**
	 * Test fishing hole constructor and getLocation at 57
	 */
	@Test
	public void testCreateFishHoleGetLocation57() {
		FishingHole theFishingHole = new FishingHole(57);
		assertEquals(theFishingHole.getLocation(), "Fishing hole at [57]");
	}
	
	

}
