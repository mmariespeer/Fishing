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
			
			if (selectionInt <= 0 || selectionInt >= 6) {
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
			}
		}	while (selectionInt != 5);
		System.out.println("Thanks for playing! - Goodbye.");
	}
	
	private void describeCurrentHole() {
		int currentHole = this.theGameBoard.getCurrentHole();
		FishingHole current = new FishingHole(currentHole);
		String holeDescription = current.toString();
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
		System.out.println("5 - Quit\n");
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
}
