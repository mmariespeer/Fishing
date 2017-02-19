package edu.westga.cs6312.fishing.model;

public class SmallFish extends FishType {
	
	public SmallFish() {
		super(100);
	}

	@Override
	public int catchFish() {
		return getFishInSchool() - 50;
	}

	@Override
	public double costToFish() {
		return 25;
	}
	
	public String toString() {
		return "small fish with " + getFishInSchool() + " fish in the school";
	};
}
