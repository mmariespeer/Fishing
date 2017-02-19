package edu.westga.cs6312.fishing.controller;

import edu.westga.cs6312.fishing.view.FishingTUI;
import edu.westga.cs6312.fishing.model.*;

public class FishingDriver {

	public static void main(String[] args) {
		GameBoard theGameBoard = new GameBoard();
		FishingTUI theTUI = new FishingTUI(theGameBoard);
		theTUI.run();

	}

}
