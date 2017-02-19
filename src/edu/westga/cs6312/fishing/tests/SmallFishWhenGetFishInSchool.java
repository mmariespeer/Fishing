package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;

public class SmallFishWhenGetFishInSchool {

	@Test
	public void testSmallFishGetterMethod() {
		SmallFish theSmallFish = new SmallFish();
		assertEquals(theSmallFish.getFishInSchool(), 100, 0);
	}

}
