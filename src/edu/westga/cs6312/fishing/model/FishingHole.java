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
		return getLocation() + " with " + this.fish.toString();
	}
	
	private void setupFishingHole(){
		int chance = (int) Math.random() * 100;
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
