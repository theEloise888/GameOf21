/**
 * Program:			Card.java
 * Author:			Eloise Lin
 * Date:			Feb 9, 2018
 * Description:		Creating the Card Class.	
 */

public class Card
{
	
	//Declare private variables
	private Suit suit;
	private int rank;

	/**
	 * This emoty constructor used to intialize suit.
	 * @param None.
	 * @returns rank to 1, suit to suit.CLUBS.
	 */
	
	Card()
	{
		suit = Suit.CLUBS;
		rank = 1;
	}

	/**
	 * This method takes the suit argument. 
	 * @param Suit, rank.
	 * @returns current suit, rank to 1. 
	 */

	Card(Suit suit)
	{
		this.suit = suit;
		this.rank = 1;
	}

	/**
	 * This method intializes suit and ranks.
	 * @param Suit, rank.
	 * @returns current suit, rank.
	 */

	
	Card(Suit suit, int rank)
	{
		this.suit = suit;
		this.rank = rank;
	}

	
	/**
	 * This method gets the suit.
	 * @param None.
	 * @returns suit.
	 */

	public Suit getSuit()
	{
		return suit;

	}
	
	/**
	 * This method gets the rank.
	 * @param None.
	 * @returns rank.
	 */


	public int getRank()
	{
		return rank;
	}

	/**
	 * This method sets the suit to suit.
	 * @param Suit suit.
	 * @returns Nothing.
	 */
	
	public void setSuit(Suit suit)
	{
		this.suit = suit;
	}

	/**
	 * This method sets the rank to rank.
	 * @param Int rank.
	 * @returns Nothing.
	 */
	
	public void setRank(int rank)
	{
		this.rank = rank;
	}

	/**
	 * This method checks the rank of each card.
	 * @param None.
	 * @returns one of the following face values.
	 */
	
	public String findFaceValue()
	{
		if (rank == 1)
		{
			return "Ace";
		} else if (rank == 2)
		{
			return "Two";
		} else if (rank == 3)
		{
			return "Three";
		} else if (rank == 4)
		{
			return "Four";
		} else if (rank == 5)
		{
			return "Five";
		} else if (rank == 6)
		{
			return "Six";
		} else if (rank == 7)
		{
			return "Seven";
		} else if (rank == 8)
		{
			return "Eight";
		} else if (rank == 9)
		{
			return "Nine";
		} else if (rank == 10)
		{
			return "Ten";
		} else if (rank == 11)
		{
			return "Jack";
		} else if (rank == 12)
		{
			return "Queen";
		} else
		{
			return "King";
		}
	}
	
	/**
	 * This method displays a string output of the face and suit cards. 
	 * @param None.
	 * @returns facevalue and suit.
	 */

	public String toString()
	{
		int i = 0;  
		i+=1; 
		return (i+1) +")"+ this.findFaceValue() + " of " + this.suit; 
	}

}