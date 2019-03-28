/**
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment 5

Creates a class called Deck that represents a deck of 52 playing cards
*/
import java.util.List;
import java.util.LinkedList;

public class Deck{
	//List that repesents a list of cards
	private LinkedList<Card> m_deck;

	/**
	Constructor for Deck that creates 52 cards, each with a unique combination of value and suit
	*/
	public Deck(){
		m_deck = new LinkedList<Card>();
		for(int x = 2; x < 15; x++){
			for(int y = 0; y < 4; y++){
				Card m_card = new Card(x);
				if(y==0){
					m_card.setSuit("hearts");
				}
				else if(y==1){
					m_card.setSuit("spades");
				}
				else if(y==2){
					m_card.setSuit("clubs");
				}
				else{
					m_card.setSuit("diamonds");
				}
				m_deck.add(m_card);
			}
		}
	}

	/**
	Returns and removes a card from the deck
	@return The card removed from the deck
	*/
	public Card deal(){
		int r = (int)(Math.random()*m_deck.size());
		return m_deck.remove(r);
	}
}
