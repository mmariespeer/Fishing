package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;

public class FishingHoleWhenGetLocation {

	@Test
	public void testCreateFishHoleGetLocation() {
		FishingHole theFishingHole = new FishingHole(0);
		assertEquals(theFishingHole.getLocation(), "Fishing hole at [0]");
	}
	
	@Test
	public void testCreateFishHoleGetLocation10() {
		FishingHole theFishingHole = new FishingHole(10);
		assertEquals(theFishingHole.getLocation(), "Fishing hole at [10]");
	}
	
	@Test
	public void testCreateFishHoleGetLocation57() {
		FishingHole theFishingHole = new FishingHole(57);
		assertEquals(theFishingHole.getLocation(), "Fishing hole at [57]");
	}
	
	

}
