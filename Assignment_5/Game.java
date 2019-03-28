/**
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment 5

Creates a Game that creates two Players that play the game War
*/
import java.util.List;
import java.util.LinkedList;

public class Game{
	//Player #1
	private Player player1;
	//Player #2
	private Player player2;
	//Deck of cards
	private Deck m_deck;
	//Total number of battles
	private int battles;
	//Total number of wars
	private int wars;
	//Total number of double wars
	private int doubleWars;

	/**
	Game constructor creates a new Deck as well as two Players
	*/
	public Game(){
		m_deck = new Deck();
		player1 = new Player(1, m_deck);
		player2 = new Player(2, m_deck);
	}

	/**
	@return Returns the number of battles played
	*/
	public int getBattles(){
		return battles;
	}

	/**
	Sets number of battles to some number
	@param b Number of battles
	*/
	public void setBattles(int b){
		battles = b;
	}

	/**
	@return Returns the number of wars played
	*/
	public int getWars(){
		return wars;
	}

	/**
	Sets number of wars to some number
	@param w Number of wars
	*/
	public void setWars(int w){
		wars = w;
	}

	/**
	@return Returns the number of double wars played
	*/
	public int getDoubleWars(){
		return doubleWars;
	}

	/**
	Sets number of double wars to some number
	@param d Number of double wars
	*/
	public void setDoubleWars(int d){
		doubleWars = d;
	}

	/**
	Plays through a game of War until one of the player's has won
	*/
	public void play(){
		Card c1;
		Card c2;
		while(!player1.hasWon() && !player2.hasWon()){
			c1 = player1.flip();
			c2 = player2.flip();
			battles++;
			int temp = 0;
			while(c1.getValue() == c2.getValue()){
				if(temp == 1){
					doubleWars++;
				}
				c1 = player1.war();
				c2 = player2.war();
				wars++;
				temp++;
			}
			if(c1.getValue() > c2.getValue()){
				player1.collect(player2.getPlayed());
				player1.collect(player1.getPlayed());
			}
			else{
				player2.collect(player1.getPlayed());
				player2.collect(player2.getPlayed());
			}
			player1.setPlayed(new LinkedList<Card>());
			player2.setPlayed(new LinkedList<Card>());
		}
	}
}
