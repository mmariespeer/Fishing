package edu.westga.cs6312.fishing.model;
/**
 * Gameboard class defines parameters for the over-all game with the angler and fishing hole objects.
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class GameBoard {
	private FishingHole[] theFishingHoles;
	private Angler theAngler;
	private int currentHole;
	
	/**
	 * Initialize the instance variables (through helper method) to create GameBoard object
	 */
	public GameBoard() {
		this.setupFishingHoles();
	}
	
	private void setupFishingHoles() {
		this.theFishingHoles = new FishingHole[10];
		for (int count = 0; count < this.theFishingHoles.length; count++) {
			this.theFishingHoles[count] = new FishingHole(count);
		}
		this.theAngler = new Angler();
		this.currentHole = 0;
	}

	/**
	 * Get the angler object
	 * @return the angler object
	 */
	public Angler getTheAngler() {
		return this.theAngler;
	}

	/**
	 * Get the current fishing hole
	 * @return the current fishing hole
	 */
	public int getCurrentHole() {
		return this.currentHole;
	}
	
	/**
	 * Display the detailed game board, each hole and the angler
	 * @return A string of information about the game board
	 */
	public String toString() {
		String holes = "";
		for (int count = 0; count < this.theFishingHoles.length; count++) {
			holes += this.theFishingHoles[count].toString() + "\n";
		}
		String gameboard = holes + "\n" + this.theAngler.toString();
		return gameboard;
	}

}
