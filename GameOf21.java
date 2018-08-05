import java.util.Scanner;

/**
 * Program:			GameOf21.java
 * Author:			Eloise Lin
 * Date:			Mar 3, 2018
 * Description:		Creating the GameOf21 Class.		
 */

public class GameOf21
{
	
	//Declare private variables
	private Deck deck;
	private Hand user;
	private Hand computer;
	private static Scanner in = new Scanner(System.in);

	
	/**
	 * This method is used to create a public GameOf21 constructor which takes in a argument. 
	 * @param String player This is the first paramter to GameOf21 method
	 * @return String This method returns a string and intializes fields. 
	 */
	
	public GameOf21(String player)
	{
		deck = new Deck();
		user = new Hand(player);
		computer = new Hand(player);
	}

	/**
	 * @param the deck
	 * @return the deck
	 */

	public Deck getDeck()
	{
		return deck;
	}

	/**
	 * @param the user
	 * @return the user
	 */

	public Hand getUser()
	{
		return user;
	}

	/**
	 * @param the computer
	 * @return the computer
	 */

	public Hand getComputer()
	{
		return computer;
	}

	/**
	 * @param the input
	 * @return the input
	 */

	public Scanner getInput()
	{
		return in;
	}

	/**
	 * This method is used to create an empty constructor playGame() 
	 * which allows the player to start the game.
	 * @param None.
	 * @return Nothing. 
	 */
	
	public void playGame()
	{
			
		System.out.println("\nDeck contains " + deck.size() + " cards.\n");
		playHand();

		if (computer.totalHand() == 21)
		{
			return;
		}

		if (user.totalHand() == 21)
		{
			return;
		}
		System.out.println("***********************"+user.getUserName()+"*******************");
		user.displayAllCards();
		System.out.println("***********************"+ "Computer" +"*******************");
		computer.displayVisibleCards();
		userDraws();
		computerDraws();
		printWinner();
		playAgain();

	}
	
	/**
	 * This method is used to create the playHand() empty constructor
	 * which allows the user and computer to get cards from the deck. 
	 * @param None.
	 * @return Nothing. 
	 */
	
	public void playHand()
	{
		for (int i = 1; i <= 2; i++)
		{
			user.hit(deck.draw());
			computer.hit(deck.draw());
		}
	}
	
	/**
	 * This method userDraws() allows the player to draw additional cards 
	 * without going over 21. 
	 * @param None.
	 * @return Nothing. 
	 */

	public void userDraws()
	{
		char userInput = 'Y';

		while (userInput == 'Y' && user.totalHand() <= 21)
		{

			System.out.print("Do you want another card(Y/N)?");
			userInput = Character.toUpperCase(in.next().charAt(0));

			// data validation loop
			do
			{
				if (userInput != 'Y' && userInput != 'N')
				{
					System.out.println("Please choose option of Y or N.");
					userInput = Character.toUpperCase(in.next().charAt(0));
				}
			} while (userInput != 'Y' && userInput != 'N');

			if (userInput == 'N')
			{
				break;
			} else
			{
				user.hit(deck.draw());
				System.out.println("***********************"+user.getUserName()+"*******************");
				user.displayAllCards();
			}

		}
	}
	/**
	 * This method is used to create the computerDraws() 
	 * which allows the computer to draw from the deck.
	 * @param None.
	 * @return Nothing. 
	 */

	public void computerDraws() 
	{
		while (computer.totalHand() < 17 && user.totalHand() > 21)
		{
			computer.hit(deck.draw());
		}
		System.out.println("***********************Computer*******************");
		computer.displayAllCards();
	}

	/**
	 * This method is used to create an empty constructor printWinner() 
	 * which totals the points from teh dealer and player and declares a winner. 
	 * @param None.
	 * @return Nothing. 
	 */
	
	public void printWinner() 
	{
		System.out.println("--------------------------------");
		System.out.println("Game of 21 - Final Score");
		System.out.println("--------------------------------");
		System.out.println(user.getUserName() + " points: " + user.totalHand());
		System.out.println("Computer points: " + computer.totalHand());
		System.out.println("--------------------------------");

		if (computer.totalHand() >= user.totalHand() && computer.totalHand() < 21)
		{
			System.out.println("Computer Wins!");
		} else if (computer.totalHand() > 21)
		{
			System.out.println("Computer Busts");
		} else if (user.totalHand() > 21)
		{
			System.out.println("Player Busts");
		} else
		{
			System.out.println(user.getUserName() + " Wins!");
			System.out.println("\n");
		}

	}

	/**
	 * This method is used to create an empty constructor playAgain() 
	 * which allows the player to play the game again. 
	 * @param None.
	 * @return Nothing. 
	 */
	
	public void playAgain()
	{
		char playerInput = 'Y';

		do
		{
				
			System.out.print("Do you want to play again (Y/N)?");
			playerInput = Character.toUpperCase(in.next().charAt(0));
			
		
			if (playerInput != 'Y' && playerInput != 'N')
			{
				System.out.println("Please choose option of Y or N.");
				playerInput = Character.toUpperCase(in.next().charAt(0));
			}			
			if (playerInput == 'Y' && deck.size() >= 6)
			{
				//computer.displayAllCards();
				user.emptyHand();
				computer.emptyHand();
				playGame();
			} else
			{
				System.out.println("\nThe Deck has " + deck.size() + " cards." + " Thank you for playing. Bye");
				System.exit(0);
			}

		} while (playerInput != 'N' && playerInput != 'Y' && deck.size() < 6);
	}
}
	