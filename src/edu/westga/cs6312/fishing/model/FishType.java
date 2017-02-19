package edu.westga.cs6312.fishing.model;

public abstract class FishType {
	private int fishInSchool;
	
	public FishType(int fishInSchool) {
		this.fishInSchool = fishInSchool;
	}

	public int getFishInSchool() {
		return fishInSchool;
	}
	
	public void removeFish(int fishToRemove) {
		
	}
	
	public abstract int catchFish();
	
	public abstract double costToFish();
	
	public String toString() {
		return "no fish";
	}
}
