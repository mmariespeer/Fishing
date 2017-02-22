package edu.westga.cs6312.fishing.model;
/**
 * Subclass LargeFish of abstract FishType defines the parameters of the large fish 
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class LargeFish extends FishType {
	
	/**
	 * Initialize the instance variables through super class
	 */
	public LargeFish() {
		super(50);
	}

	@Override
	public int catchFish() {
		int max = super.getFishInSchool();
		int random = (int) (Math.random() * ((max - 0) + 1));
		super.removeFish(random);
		return this.getFishInSchool();
	}

	@Override
	public int costToFish() {
		return 50;
	}
	
	/**
	 * Display details of the small fish class
	 * @return a String detailing the small fish class
	 */
	public String toString() {
		return "large fish with " + getFishInSchool() + " fish in the school";
	};
}