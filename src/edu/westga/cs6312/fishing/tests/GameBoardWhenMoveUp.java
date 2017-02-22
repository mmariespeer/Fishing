package edu.westga.cs6312.fishing.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.fishing.model.*;
/**
 * J-Unit test class to confirm Gameboard moveUp method
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class GameBoardWhenMoveUp {

	/**
	 * Test moveUp from 0 to 1
	 */
	@Test
	public void testMoveUpFrom0to1() {
		GameBoard theGameBoard = new GameBoard();
		theGameBoard.moveUp();
		assertEquals(theGameBoard.getCurrentHole(), 1, 0);
	}
	
	/**
	 * Test moveUp from 0 back to 0
	 */
	@Test
	public void testMoveUpFrom0to0() {
		GameBoard theGameBoard = new GameBoard();
		theGameBoard.moveUp();
		theGameBoard.moveUp();
		theGameBoard.moveUp();
		theGameBoard.moveUp();
		theGameBoard.moveUp();
		theGameBoard.moveUp();
		theGameBoard.moveUp();
		theGameBoard.moveUp();
		theGameBoard.moveUp();
		theGameBoard.moveUp();
		assertEquals(theGameBoard.getCurrentHole(), 0, 0);
	}

}
