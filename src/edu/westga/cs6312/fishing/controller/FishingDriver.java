package edu.westga.cs6312.fishing.controller;

import edu.westga.cs6312.fishing.view.FishingTUI;
import edu.westga.cs6312.fishing.model.*;
/**
 * The driver of the Fishing Hole game
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class FishingDriver {

	/**
	 * The entry point of the application
	 * @param args no args
	 */
	public static void main(String[] args) {
		GameBoard theGameBoard = new GameBoard();
		FishingTUI theTUI = new FishingTUI(theGameBoard);
		theTUI.run();

	}

}
