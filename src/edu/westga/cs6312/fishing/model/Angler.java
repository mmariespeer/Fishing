package edu.westga.cs6312.fishing.model;

public class Angler {
	private int moneyLeft;
	private int fishCaught;
	
	public Angler() {
		this.moneyLeft = 100;
		this.fishCaught = 0;
	}

	public int getMoneyLeft() {
		return moneyLeft;
	}

	public int getFishCaught() {
		return fishCaught;
	}
	
	//pre-conditions needed
	public int payToFish(int money) {
		this.moneyLeft = this.moneyLeft - money;
		return this.moneyLeft;
	}
	
	
	//pre-conditions needed
	public int catchFish(int fishCaught) {
		this.fishCaught = this.fishCaught + fishCaught;
		return this.fishCaught;
	}
	
	public String toString() {
		return "The angler with " + getMoneyLeft() + " money units and " + getFishCaught() + " fish";
	}
}
