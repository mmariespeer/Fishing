package edu.westga.cs6312.fishing.model;

public class GameBoard {
	private FishingHole[] theFishingHoles;
	private Angler theAngler;
	private int currentHole;
	
	public GameBoard() {
		setupFishingHoles();
	}
	
	private void setupFishingHoles() {
		this.theFishingHoles = new FishingHole[10];
		for (int i = 0; i < theFishingHoles.length; i++){
			this.theFishingHoles[i] = new FishingHole(i);
		}
		this.theAngler = new Angler();
		this.currentHole = 0;
	}

	public Angler getTheAngler() {
		return theAngler;
	}

	public int getCurrentHole() {
		return currentHole;
	}
	
	public String toString() {
		String holes = "";
		for (int i = 0; i < theFishingHoles.length; i++){
			holes = this.theFishingHoles[i].toString() + "\n";
		}
		String gameboard = holes + "\n" + theAngler.toString();
		return gameboard;
	}

}
