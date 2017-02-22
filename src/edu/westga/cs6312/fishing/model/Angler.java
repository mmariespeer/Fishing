package edu.westga.cs6312.fishing.model;
/**
 * The angler class that will represent the player.
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class Angler {
	private int moneyLeft;
	private int fishCaught;
	
	/**
	 * Initialize the instance variables
	 */
	public Angler() {
		this.moneyLeft = 100;
		this.fishCaught = 0;
	}

	/**
	 * Return the amount of money the angler has.
	 * @return moneyLeft as an int
	 */
	public int getMoneyLeft() {
		return this.moneyLeft;
	}

	/**
	 * Return the number of fish the angler has caught.
	 * @return fishCaught as an int
	 */
	public int getFishCaught() {
		return this.fishCaught;
	}
	
	/**
	 * Deduct the amount of money it costs to fish from the angler's money.
	 * @param money to fish as an integer
	 * @return the angler's updated money left amount
	 * 
	 * Precondition: money !< 0
	 * Postcondition: an amount of money is deducted from the angler's money
	 */
	public int payToFish(int money) {
		if (money < 0) {
			throw new IllegalArgumentException("Invalid amount of money");
		}
		this.moneyLeft = this.moneyLeft - money;
		return this.moneyLeft;
	}
	
	
	/**
	 * Add the number of fish caught to the angler's "fish caught" amount
	 * @param fishCaught as an integer
	 * @return the updated angler's "fish caught" amount
	 * 
	 * Precondition: fishCaught !< 0
	 * Postcondition: a number of fish is added to the angler's "fish caught" property
	 */
	public int catchFish(int fishCaught) {
		if (fishCaught < 0) {
			throw new IllegalArgumentException("Cannot catch negative fish");
		}
		this.fishCaught += fishCaught;
		return this.fishCaught;
	}
	
	/**
	 * Create a readable string detailing the angler and his attributes
	 * @return A string about the angler
	 */
	public String toString() {
		return "The angler with " + this.getMoneyLeft() + " money units and " + this.getFishCaught() + " fish";
	}
}
