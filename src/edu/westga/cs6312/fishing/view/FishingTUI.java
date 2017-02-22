package edu.westga.cs6312.fishing.view;
import edu.westga.cs6312.fishing.model.*;
import java.util.Scanner;
/**
 * The FishingTUI class acts as the user interface for the application
 * @author Melissa Speer Osborne
 * @version 02/21/2017
 */
public class FishingTUI {
	private GameBoard theGameBoard;
	private Scanner input;
	
	/**
	 * Initialize the instance variables to create the TUI object
	 * @param aGame A game board object
	 * Precondition: aGame != null
	 * Postcondition: A game board and user are created.
	 */
	public FishingTUI(GameBoard aGame) {
		if (aGame == null) {
			throw new IllegalArgumentException("Invalid game");
		}
		this.theGameBoard = aGame;
		this.input = new Scanner(System.in);
	}
	
	/**
	 * The application instructions
	 */
	public void run() {
		System.out.println("Welcome to Down by the Fishin' Hole");
		int selectionInt;
		do {
			this.showMenu();
			selectionInt = this.getIntegerFromUser("Please enter your selection: ");
			
			if (selectionInt <= 0 || selectionInt >= 7) {
				System.out.println("Invalid Choice");
			}
			
			if (selectionInt == 1) {
				this.describeCurrentHole();
			} else if (selectionInt == 2) {
				this.describeAngler();
			} else if (selectionInt == 3) {
				this.describeGame();
			} else if (selectionInt == 4) {
				this.getMoveDirection();
			} else if (selectionInt == 5) {
				this.fishTheHole();
			}
		}	while (selectionInt != 6);
		System.out.println("Thanks for playing! - Goodbye.");
	}
	
	private void describeCurrentHole() {
		int currentHole = this.theGameBoard.getCurrentHole();
		FishingHole current = this.theGameBoard.getTheFishingHole(currentHole);
		String holeDescription = current.toString();
		System.out.println(current.getFish());
		System.out.println(holeDescription);
	}
	
	private void describeAngler() {
		Angler currentAngler = this.theGameBoard.getTheAngler();
		System.out.println(currentAngler.toString());
	}
	
	private void describeGame() {
		System.out.println(this.theGameBoard.toString());
	}
	
	private void showMenu() {
		System.out.println("\n1 - Describe current fishing hole");
		System.out.println("2 - Describe angler");
		System.out.println("3 - Describe game board");
		System.out.println("4 - Move");
		System.out.println("5 - Fish the hole");
		System.out.println("6 - Quit\n");
	}
	
	
	private int getIntegerFromUser(String message) {
		System.out.println(message);
		String userInput = this.input.nextLine();
		int answer = Integer.parseInt(userInput);
		return answer;
	}
	
	private void getMoveDirection() {
		int selectionInt;
		do {
			selectionInt = this.getIntegerFromUser("\n1 - Up\n2 - Down\n");

			if (selectionInt <= 0 || selectionInt >= 3) {
				System.out.println("Invalid Choice");
			}  
		} while (selectionInt <= 0 || selectionInt >= 3);
		
		
		if (selectionInt == 1) {
			this.move(1);
		} else {
			this.move(2);
		}
	}
	
	private void move(int direction) {
		if (direction == 1) {
			this.theGameBoard.moveUp();
		} else {
			this.theGameBoard.moveDown();
		}
	}
	
	private void fishTheHole() {

		Angler theAngler = this.theGameBoard.getTheAngler();
		int money = theAngler.getMoneyLeft();
		
		FishingHole theHole = this.theGameBoard.getTheFishingHole(this.theGameBoard.getCurrentHole());
		FishType theFish = theHole.getFish(); 
		
		int fishInSchool;
		int costToFish;
		
		if (theFish == null) {
			fishInSchool = 0;
			costToFish = 0;
			
		} else {
			fishInSchool = theFish.getFishInSchool();
			costToFish = theFish.costToFish();
		}
		
		
		
		if (costToFish > money) {
			System.out.println("There is not enough money");
		} else if (fishInSchool == 0) {
			System.out.println("There are no fish left");
		}  else {
			theAngler.payToFish(costToFish);
			int fishCaught = theFish.catchFish();
			theAngler.catchFish(fishInSchool - fishCaught);
			System.out.println("\n The angler has " + theAngler.getMoneyLeft() + " money "
					+ "left\nThere are " + theFish.getFishInSchool() + " fish left in this hole");
		} 
		
	}
	

}
