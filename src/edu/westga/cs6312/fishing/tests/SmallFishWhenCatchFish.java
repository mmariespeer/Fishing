package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;

public class SmallFishWhenCatchFish {

	@Test
	public void testSmallFishCatchFish() {
		SmallFish theSmallFish = new SmallFish();
		assertEquals(theSmallFish.catchFish(), 50, 0);
	}

}
