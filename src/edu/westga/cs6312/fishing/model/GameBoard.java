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
	 * Get the fishing hole individually at a specific index
	 * @param index as an integer
	 * @return a FishingHole object
	 * Precondition: index !< 0 or > theFishingHoles.length
	 * Postcondition: A specific FishingHole from the array
	 */
	public FishingHole getTheFishingHole(int index) {
		if (index < 0 || index > this.theFishingHoles.length) {
			throw new IllegalArgumentException("Invalid index");
		}
		FishingHole theHole = this.theFishingHoles[index];
		return theHole;
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
	
	/**
	 * Move up to the next fishing hole
	 */
	public void moveUp() {
		if (this.currentHole == 9) {
			this.currentHole = 0;
		} else {
			this.currentHole = this.currentHole + 1;
		}
	}
	
	/**
	 * Move down to the next fishing hole
	 */
	public void moveDown() {
		if (this.currentHole == 0) {
			this.currentHole = 9;
		} else {
			this.currentHole = this.currentHole - 1;
		}
	}

}
