/**
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment 5

Creates a Player that is dealt 26 cards and given a number
*/
import java.util.List;
import java.util.LinkedList;

public class Player{
	//Player number (1 or 2)
	private int m_num;
	//List of cards in player's hand
	private LinkedList<Card> m_hand;
	//List of cards played in a round
	private LinkedList<Card> m_played;

	/**
	Constructor for Player class
	@param n Player number
	@param hand Player's cards (half the deck intitially)
	*/
	public Player(int n, Deck hand){
		m_num = n;
		m_hand = new LinkedList<Card>();
		m_played = new LinkedList<Card>();
		for(int x = 0; x < 26; x++){
			m_hand.add(hand.deal());
		}
	}

	/**
	@return Returns the player's number
	*/
	public int getNum(){
		return m_num;
	}

	/**
	Sets the player's number to either 1 or 2
	@param n Player's number
	*/
	public void setNum(int n){
		m_num = n;
	}

	/**
	Returns a list of cards the player played in a round
	@return LinkedList<Card>
	*/
	public LinkedList<Card> getPlayed(){
		return m_played;
	}

	/**
	Sets the played cards to a list of cards
	(Used to reset cards played after a round is over)
	@param cards A list of cards
	*/
	public void setPlayed(LinkedList<Card> cards){
		m_played = cards;
	}

	/**
	Returns the size of the player's hand
	@return int
	*/
	public int getHand(){
		return m_hand.size();
	}

	/**
	Removes the top card from the player's hand and returns that card
	@return Card
	*/
	public Card flip(){
		m_played.add(m_hand.get(0));
		return m_hand.remove(0);
	}

	/**
	Adds the cards played to the player's deck when they win a round
	@param cards List of cards played by either player
	*/
	public void collect(LinkedList<Card> cards){
		for(int x = 0; x < cards.size(); x++){
			m_hand.add(cards.get(x));
		}
	}

	/**
	Returns true if the player has won
	@return boolean Whether or not the player has won
	*/
	public boolean hasWon(){
		if(m_hand.size()==52){
			return true;
		}
		return false;
	}

	/**
	Follows the logic of a war
	*/
	public Card war(){
		if(m_hand.size()==0){
			return new Card(-1);
		}
		for(int x = 0; x < 3; x++){
			if(m_hand.size()==1){
				return flip();
			}
			flip();
		}
		return flip();
	}
}
