import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Program: Deck.java 
 * Author: Eloise Lin 
 * Date: February 24, 2018 
 * Description: A program for creating the deck
 */

public class Deck extends CardSet
{
	// create and initialize the size of the deck
	public static int SIZE = 52;

	// Create the array list of cards
	protected List<Card> cards = new ArrayList<>();

	/**
	 * This is a empty constructor Deck() 
	 * which takes in two empty constructors.
	 * @param None
	 * @return Nothing
	 */
	
	Deck()
	{
		super(SIZE);
		populateDeck();
		shuffle();
	}

	/**
	 * This is a void method to create populateDeck()
	 * @param None
	 * @return Nothing
	 */
	public void populateDeck()
	{
		for (Suit suit : Suit.values())
		{
			for (int rank = 1; rank <= 13; ++rank)
			{
				cards.add(new Card(suit, rank));
			}

		}

	}

	/**
	 * Shuffle() puts all the used cards back into the deck, and shuffle it into a random
	 * order.
	 * @param None
	 * @returns and removes the top card object from the deck
	 */
	public void shuffle()
	{
		Collections.shuffle(cards);
	}

	/**
	 * This draw() method allows the user to remove from the deck at index 0. 
	 * @param None
	 * @returns and removes the top card object from the deck
	 */
	public Card draw()
	{
		cards.remove(0);
		return cards.get(0);

	}
	
	/**
	 * This size() method returns the remaining cards left in the deck. 
	 * @param None
	 * @returns size of deck. 
	 */
	
	public int size()
	{
		return cards.size();
	}

	/**
	 * This displayCards() method accepts an int argument to display all cards at index i. 
	 * @param None
	 * @returns Nothing. 
	 */
	public void displayCards(int start)
	{
		for (int i = start; i < cards.size(); i++)
		{
			System.out.println(cards.get(i));
		}

	}
	
	/**
	 * This displayAllCards() method accepts an int argument to display all cards at index 0. 
	 * @param None
	 * @returns Nothing. 
	 */

	public void displayAllCards()
	{

		displayCards(0);

	}
	
	/**
	 * This displayVisibleCards() method accepts an int argument to display all cards at index 1. 
	 * @param None
	 * @returns Nothing. 
	 */

	public void displayVisibleCards()
	{
		displayCards(1);
	}

}
