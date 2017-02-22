package edu.westga.cs6312.fishing.model;
/**
 * The abstract FishType class defining the properties of the fish for use in subclasses.
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public abstract class FishType {
	private int fishInSchool;
	
	/**
	 * Initialize the instance variables to create FishType object
	 * @param fishInSchool as an integer
	 * Precondition: fishInSchool !< 0
	 * Postcondition: a FishType object with a number of fish is created
	 */
	public FishType(int fishInSchool) {
		if (fishInSchool < 0) {
			throw new IllegalArgumentException("Number of fish cannot be negative");
		}
		this.fishInSchool = fishInSchool;
	}

	/**
	 * Get the number of fish in the school of fish
	 * @return the number of fish as an integer
	 */
	public int getFishInSchool() {
		return this.fishInSchool;
	}
	
	/**
	 * Remove fish from school of fish
	 * @param fishToRemove as an integer
	 * Precondition: fishToRemove !< 0
	 * Postcondition: a specific number of fish is removed from the school of fish
	 */
	public void removeFish(int fishToRemove) {	
		if (fishToRemove < 0) {
			throw new IllegalArgumentException("Cannot remove a negative amount of fish");
		}
		this.fishInSchool = this.fishInSchool - fishToRemove;
	}
	
	/**
	 * Abstract method to catch fish (remove from school)
	 * @return the number of fish as an integer
	 */
	public abstract int catchFish();
	
	/**
	 * Abstract method to get the amount of money to charger player to fish 
	 * @return the cost to fish as an integer
	 */
	public abstract int costToFish();
	
	/**
	 * Display information about the FishType class
	 * @return a string detailing the fish class
	 */
	public String toString() {
		return "There is a school of " + this.fishInSchool + " fish";
	}
	

}
