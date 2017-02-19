package edu.westga.cs6312.fishing.view;
import edu.westga.cs6312.fishing.model.*;
import java.util.Scanner;

public class FishingTUI {
	GameBoard theGameBoard;
	Scanner input;
	
	public FishingTUI(GameBoard aGame) {
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
			selectionInt = getIntegerFromUser("Please enter your selection: ");
			
			if (selectionInt <= 0 || selectionInt >= 5) {
				System.out.println("Invalid Choice");
			}
			
			if (selectionInt == 1) {
				this.describeCurrentHole();
			} else if (selectionInt == 2) {
				this.describeAngler();
			} else if (selectionInt == 3) {
				this.describeGame();
			}
		}	while (selectionInt != 4);
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
		System.out.println("4 - Quit\n");
	}
	
	
	private int getIntegerFromUser(String message) {
		System.out.println(message);
		String userInput = input.nextLine();
		int answer = Integer.parseInt(userInput);
		return answer;
	}
}
