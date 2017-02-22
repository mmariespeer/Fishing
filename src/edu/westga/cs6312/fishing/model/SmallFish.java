package edu.westga.cs6312.fishing.model;
/**
 * Subclass SmallFish of abstract FishType defines the parameters of the small fish 
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class SmallFish extends FishType {
	
	/**
	 * Initialize the instance variables through super class
	 */
	public SmallFish() {
		super(100);
	}

	@Override
	public int catchFish() {
		super.removeFish(50);
		return this.getFishInSchool();
	}

	@Override
	public int costToFish() {
		return 25;
	}
	
	/**
	 * Display details of the small fish class
	 * @return a String detailing the small fish class
	 */
	public String toString() {
		return "small fish with " + getFishInSchool() + " fish in the school";
	};
}
