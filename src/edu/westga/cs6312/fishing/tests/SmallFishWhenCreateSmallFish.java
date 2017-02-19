package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;

public class SmallFishWhenCreateSmallFish {

	@Test
	public void testSmallFishConstructToString() {
		SmallFish theSmallFish = new SmallFish();
		assertEquals(theSmallFish.toString(), "small fish with 100 fish in the school");
	}

}
