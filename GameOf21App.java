import java.util.Scanner;


/**
 * Program:			GameOf21App.java
 * Author:			Eloise Lin
 * Date:			Mar 11, 2018
 * Description:		Testing the Gameof21App. 	
 */

public class GameOf21App
{
	public static void main(String[] args)
	{
		//Call printTitle to print title 
		printTitle();
		//Create a scanner object
		Scanner scanner= new Scanner(System.in);
		//Prompt user for name 
		System.out.print("Enter your name: ");
		String name = scanner.next(); 
		GameOf21 gameOf21App = new GameOf21(name);
		//Display the name and a good luck message
		System.out.println(name + ", "+ "Good Luck!");
	
		
		System.out.println("------------------------------------------");
		System.out.println("Welcome to the Game of 21!");
		System.out.println("------------------------------------------");
		//Call the printInstructions() to display game instructions
		printInstructions();
		//Call the playGame method to start playing the game
		gameOf21App.playGame(); 
		
	}
	
	
	/*
	 *Method:		printInstructions	
	 *Purpose: 		prints the instructions for gameof21		
	 *Parameters:	none
	 *Returns:		void
	*/
	public static void printInstructions()
	{
		System.out.println("---------------------");
		System.out.println("HOW TO PLAY: ");
		System.out.println("---------------------");
		System.out.println(
				"The objective of the game is get the closest to 21 without going over. The player and the computer are dealt 2 cards. "
						+ "\nThe player is allowed to draw additional cards to improve his hand, without going over 21. "
						+ "\nThe computer can then choose to draw cards; though the computer will not draw if the player has busted.  \r\n"
						+ "\nFace cards have a value of 10. Aces can be high or low (that is, 11 points or 1 point) depending on "
						+ "\nwhich is the best value which achieves the closest score to 21 without going over.\n"
						+ "\nAfter cards have been drawn by the player and the computer, the score is totaled and a winner is declared.\n");
	}

	/*
	 *Method:		printTitle	
	 *Purpose: 		Prints the title		
	 *Parameters:	none
	 *Returns:		void
	*/
	public static void printTitle()
	{
		System.out.println("------------------------------------------");
		System.out.println("This application allows a player to play\n" + 
				"the Game of 21 against the computer.");
		System.out.println("------------------------------------------\n");
	}

}