package edu.westga.cs6312.fishing.model;
/**
 * The FishingHole class describes the individual fishing holes the angler(player) will be able to fish at.
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class FishingHole {
	private FishType fish;
	private int holeLocation;
	
	/**
	 * Initialize the instance variables
	 * @param holeLocation the location of the hole as integer
	 * Precondition: holeLocation !< 0
	 * Postcondition: A fishing hole is created
	 */
	public FishingHole(int holeLocation) {
		if (holeLocation < 0) {
			throw new IllegalArgumentException("Invalid number");
		}
		this.holeLocation = holeLocation;
		this.setupFishingHole();
	}
	
	/**
	 * Display location information about the fishing hole
	 * @return a string detailing the fishing hole location
	 */
	public String getLocation() {
		return "Fishing hole at [" + this.holeLocation + "]";
	}
	
	/**
	 * Get the type of fish object contained in a fishing hole
	 * @return the FishType object
	 */
	public FishType getFish() {
		return this.fish;
	}
	
	/**
	 * Display the fishing hole location and type of fish in it (or no fish if empty)
	 * @return String description of the fishing hole
	 */
	public String toString() {
		if (this.fish != null) {
			return this.getLocation() + " containing " + this.fish.toString();
		} else {
			return this.getLocation() + " containing no fish";
		}
	}
	
	private void setupFishingHole() {
		int chance = (int) (Math.random() * 100);
		if (chance >= 50) {
			this.fish = null;
		} else {
			this.fish = this.addFish();
		}
	}
	
	private FishType addFish() {
		FishType smallFish = new SmallFish();
		return smallFish;
	}
}
