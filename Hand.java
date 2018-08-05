/**
 * Program:			Hand.java
 * Author:			Eloise Lin
 * Date:			Mar 2, 2018
 * Description:		Creating the Hand class. 		
 */

public class Hand extends CardSet
{

	//Declare variable
	private String userName;

	
	/**
	 * Hand() method which takes in a username argument.
	 * @param String username.
	 * @returns username.
	 */
	
	Hand(String userName)
	{
		this.userName = userName;
	}
	
	
	/**
	 * @param the username
	 * @return the username
	 */
	
	public String getUserName()
	{
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	/**
	 * Add a card to the hand. It is added at the end of the current hand.
	 * @param c the non-null card to be added.
	 * @throws NullPointerException if the parameter c is null.
	 */
	
	public void hit(Card c)
	{
		if (c == null)
			throw new NullPointerException("Can't add a null card value to a hand.");
		cards.add(c);
	}
	
	/**
	 * This method gets the card value. 
	 * @param Card c.
	 * @returns card value.
	 */
	public int getCardValue(Card c)
	{
		if (c.getRank() > 10)
		{
			return 10;
		} else
		{
			return c.getRank();
		}
	}

	/**
	 * This method gets the value of the total hand depending 
	 * on if Ace is counted as a 1 or 11.  
	 * @param None.
	 * @returns value. 
	 */
	
	public int totalHand()
	{

		int value = 0;
		boolean ace = false;
		cards.size();

		for (int i = 0; i < cards.size(); ++i)
		{
			Card card;
			int cardValue;
			card = cards.get(i);
			cardValue = getCardValue(card);

			if (cardValue == 1)
			{
				ace = true;
			}
			value += cardValue;
		}
		if (ace == true && value + 10 <= 21)
			value += 10;
		return value;
	}
	
	/**
	 * This method gets the cards that are visible. 
	 * @param None.
	 * @returns card value.
	 */
	
	public int totalVisibleHand()
	{
		boolean ace = false;
		int value = 0;
		for (int i = 1; i < cards.size(); ++i)
		{
			Card card;
			int cardValue;
			card = cards.get(i);
			cardValue = getCardValue(card);
			System.out.println(cards.get(i));
			if (cardValue == 1)
			{
				ace = true;
			}
			value += cardValue;
		}
		if (ace == true && value + 10 <= 21)
			value += 10;
		return value;
	}

	/**
	 * This method  hasBlackJack() returns true
	 * if hand totals 21 and the size of the hand is 2 cards
	 * @param None.
	 * @returns true or false.
	 */
	
	public boolean hasBlackJack() 
	{
		{
			if (cards.size() == 2 && totalHand() == 21)
			{
				return true;
			} else
			{
				return false;
			}
		}
	}


	/**
	 * This method empties the hand.
	 * @param None.
	 * @returns Nothing. 
	 */
	
	public void emptyHand()
	{
		cards.clear();
	}


	/**
	 * This method displays all cards from the int start.
	 * @param Int start.
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
	 * This method displays all cards.
	 * @param None.
	 * @returns cards at index 0.
	 */

	public void displayAllCards()
	{
		displayCards(0);
	}

	/**
	 * This method displays all cards.
	 * @param None.
	 * @returns cards at index 1.
	 */
	
	public void displayVisibleCards()
	{
		displayCards(1);
	}

}
