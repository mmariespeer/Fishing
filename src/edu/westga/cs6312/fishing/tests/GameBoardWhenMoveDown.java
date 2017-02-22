package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;
/**
 * J-Unit test to confirm GameBoard class moveDown method
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class GameBoardWhenMoveDown {

	/**
	 * Test moveDown function from initial space 1 to last place 10
	 */
	@Test
	public void testMoveDown1to10() {
		GameBoard theGameBoard = new GameBoard();
		theGameBoard.moveDown();
		assertEquals(theGameBoard.getCurrentHole(), 9, 0);
	}
	
	/**
	 * Test moveDown function from 1 to 5
	 */
	@Test
	public void testMoveDown1to5() {
		GameBoard theGameBoard = new GameBoard();
		theGameBoard.moveDown();
		theGameBoard.moveDown();
		theGameBoard.moveDown();
		theGameBoard.moveDown();
		theGameBoard.moveDown();
		assertEquals(theGameBoard.getCurrentHole(), 5, 0);
	}
}
