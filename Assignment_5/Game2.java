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
import java.util.Scanner;

public class Game2{
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

	public static void main(String[] args) {
		Game2 g1 = new Game2();
		g1.play();
	}
	/**
	Game constructor creates a new Deck as well as two Players
	*/
	public Game2(){
		m_deck = new Deck();
		player1 = new Player(1, m_deck);
		player2 = new Player(2, m_deck);
	}

	/**
	Returns number of battles played
	@return int
	*/
	public int getBattles(){
		return battles;
	}

	/**
	Returns number of wars played
	@return int
	*/
	public int getWars(){
		return wars;
	}

	/**
	Returns number of double wars played
	@return int
	*/
	public int getDoubleWars(){
		return doubleWars;
	}

	/**
	Plays through a game of War until one of the player's has won
	*/
	public void play(){
		Scanner s = new Scanner(System.in);
		Card c1;
		Card c2;
		while(!player1.hasWon() && !player2.hasWon() && !s.nextLine().equals("exit")){
			c1 = player1.flip();
			c2 = player2.flip();
			System.out.printf("%-30s %-30s%n", "Player 1: " + c1.toString(), "Player 2: " + c2.toString());
			battles++;
			int temp = 0;
			while(c1.getValue() == c2.getValue()){
				if(temp == 1){
					System.out.println("DOUBLE WAR!!");
					doubleWars++;
				}
				else{
					System.out.println("WAR!");
				}
				c1 = player1.war();
				c2 = player2.war();
				System.out.printf("%-30s %-30s%n", "Player 1: " + c1.toString(), "Player 2: " + c2.toString());
				wars++;
				temp++;
			}
			if(c1.getValue() > c2.getValue()){
				player1.collect(player2.getPlayed());
				player1.collect(player1.getPlayed());
				System.out.println("Player 1 wins the battle");
			}
			else{
				player2.collect(player1.getPlayed());
				player2.collect(player2.getPlayed());
				System.out.println("Player 2 wins the battle");
			}
			player1.setPlayed(new LinkedList<Card>());
			player2.setPlayed(new LinkedList<Card>());
			System.out.printf("%-30s %-30s%n", "Player 1: " + player1.getHand() + " cards", "Player 2: " + player2.getHand() + " cards");
			System.out.println();
		}
		if(player1.hasWon()){
			System.out.println("Player 1 wins the war!");
		}
		else{
			System.out.println("Player 2 wins the war!");
		}
	 System.out.println();
	}
}
