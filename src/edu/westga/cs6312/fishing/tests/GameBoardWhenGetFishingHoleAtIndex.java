package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;
/**
 * J-unit test to confirm GameBoard getTheFishingHole method
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class GameBoardWhenGetFishingHoleAtIndex {

	/**
	 * Test get correct location at index 0
	 */
	@Test
	public void testGetFishingHoleAt0() {
		GameBoard theGameBoard = new GameBoard();
		FishingHole theHole = theGameBoard.getTheFishingHole(0);
		assertEquals(theHole.getLocation(), "Fishing hole at [0]");
	}
	
	/**
	 * Test get correct location at index 5
	 */
	@Test
	public void testGetFishingHoleAt5() {
		GameBoard theGameBoard = new GameBoard();
		FishingHole theHole = theGameBoard.getTheFishingHole(5);
		assertEquals(theHole.getLocation(), "Fishing hole at [5]");
	}
	
	/**
	 * Test get correct location at index 9
	 */
	@Test
	public void testGetFishingHoleAt9() {
		GameBoard theGameBoard = new GameBoard();
		FishingHole theHole = theGameBoard.getTheFishingHole(9);
		assertEquals(theHole.getLocation(), "Fishing hole at [9]");
	}
	


}
