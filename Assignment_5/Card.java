/**
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment 5

Creates a class called Card that represents a playing cards
*/
public class Card{
	//Suit of the card ("hearts", "diamonds", "clubs", and "spades")
	private String suit;
	//Value of a card (Represented by a number 2-14, but displayed as a String 2-10, J, Q, K, A)
	private int value;

	/**
	Default constructor for card with a value of -1 and suit of null
	*/
	public Card(){
		value = -1;
		suit = null;
	}

	/**
	Overloaded constructor for card that takes in a value
	@param v Value of card
	*/
	public Card(int v){
		value = v;
		suit = null;
	}

	/**
	@return The value of a card
	*/
	public int getValue(){
		return value;
	}

	/**
	Sets the value to a number
	@param v Value of a card
	*/
	public void setValue(int v){
		value = v;
	}

	/**
	@return The suit of a card
	*/
	public String getSuit(){
		return suit;
	}

	/**
	Sets the suit of a card to a String
	@param s suit of card
	*/
	public void setSuit(String s){
		suit = s;
	}

	/**
	@return The name of the card using the format "value" of "suit"
	*/
	public String toString(){
		if(value<=10){
			return (value + " of " + suit);
		}
		else if(value==11){
			return ("Jack of " + suit);
		}
		else if(value==12){
			return ("Queen of " + suit);
		}
		else if(value==13){
			return ("King of " + suit);
		}
		else{
			return ("Ace of " + suit);
		}
	}
}
