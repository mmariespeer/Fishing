package edu.westga.cs6312.fishing.model;

public class FishingHole {
	private FishType fish;
	private int holeLocation;
	
	public FishingHole(int holeLocation) {
		this.holeLocation = holeLocation;
		setupFishingHole();
	}
	
	public String getLocation() {
		return "Fishing hole at [" + this.holeLocation + "]";
	}
	
	public FishType getFish() {
		return this.fish;
	}
	
	public String toString() {
		if (this.fish != null) {
			return getLocation() + " containing " + this.fish.toString();
		} else {
			return getLocation() + " containing no fish";
		}
	}
	
	private void setupFishingHole(){
		int chance = (int) (Math.random() * 100);
		if (chance >= 50) {
			this.fish = null;
		} else {
			this.fish = addFish();
		}
	}
	
	private FishType addFish() {
		FishType smallFish = new SmallFish();
		return smallFish;
	}
}
