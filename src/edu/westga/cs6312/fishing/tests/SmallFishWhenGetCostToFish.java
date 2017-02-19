package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;

public class SmallFishWhenGetCostToFish {

	@Test
	public void testSmallFishCostToFish() {
		SmallFish theSmallFish = new SmallFish();
		assertEquals(theSmallFish.costToFish(), 25, 0);
	}

}
