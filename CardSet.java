import java.util.ArrayList;
/**
 * Program:			CardSet.java
 * Author:			Eloise Lin
 * Date:			Feb 21, 2018
 * Description:		Creating the CardSet class. 	
 */

public abstract class CardSet
{
	//Create the arraylist of cards
	protected ArrayList<Card> cards;

	/**
	 * This method initializes the arraylist of cards.
	 * @param None
	 * @returns Nothing. 
	 */
	CardSet()
	{
		cards = new ArrayList<Card>();
	}
	
	/**
	 * This method accepts an int argument to initialize cards to 
	 * the number of cards size. 
	 * @param None
	 * @returns Nothing. 
	 */

	CardSet(int numberOfCards)
	{
		cards = new ArrayList<Card>(numberOfCards);
	}
	
	/**
	 * This is a abstract method to displayAllCards().
	 * @param None
	 * @returns Nothing. 
	 */
	
	public abstract void displayAllCards();
	
	/**
	 * This is a abstract method to displayAllVisibleCards().
	 * @param None
	 * @returns Nothing. 
	 */
	
	public abstract void displayVisibleCards();

}
