/**
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment 5

Creates a class called Simulation that runs a user-inputted amount of games (default is 10).
It can also output the aggregate statistics from all the games run.
*/
import java.util.List;
import java.util.LinkedList;

public class Simulation{
	//Average battles played per game
	public int avgBattles;
	//Average wars played per game
	public int avgWars;
	//Average double wars played per game
	public int avgDoubleWars;
	//Max number of battles played in a game
	public int maxBattles;
	//Min number of battles played in a game
	public int minBattles;
	//Max number of wars played in a game
	public int maxWars;
	//Min number of wars played in a game
	public int minWars;

	//Number of games to be simulated
	private static int m_games;
	//List of battles in each game
	private static LinkedList<Integer> m_battles;
	//List of wars in each game
	private static LinkedList<Integer> m_wars;
	//List of double wars in each game
	private static LinkedList<Integer> m_doubleWars;

	/**
	Constructor for the Simulation class
	@param n Number of games to be simulated
	*/
	public Simulation(int n){
		maxBattles = -1;
		minBattles = -1;
		maxWars = -1;
		minWars = -1;
		m_games = n;
		m_battles = new LinkedList<Integer>();
		m_wars = new LinkedList<Integer>();
		m_doubleWars = new LinkedList<Integer>();
	}

	/**
	Runs a user-inputted amount of games (10 if there is no user-input)
	Then calculates and displays the statistics
	*/
	public static void main(String[] args){
		Simulation s1 = new Simulation(10);
		if(args.length!=0){
			m_games = Integer.parseInt(args[0]);
		}
		for(int x = 0; x < m_games; x++){
			Game g1 = new Game();
			g1.play();

			m_battles.add(g1.getBattles());
			m_wars.add(g1.getWars());
			m_doubleWars.add(g1.getDoubleWars());
		}
		s1.calculate();
		s1.report();
	}

	/**
	Returns maxBattles
	@return int
	*/
	public int getMaxBattles(){
		return maxBattles;
	}

	/**
	Returns minBattles
	@return int
	*/
	public int getMinBattles(){
		return minBattles;
	}

	/**
	Returns maxWars
	@return int
	*/
	public int getMaxWars(){
		return maxWars;
	}

	/**
	Returns minWars
	@return int
	*/
	public int getMinWars(){
		return minWars;
	}

	/**
	Returns number of games
	@return int
	*/
	public int getGames(){
		return m_games;
	}

	/**
	Calculates and sets the instance variables to the correct value.
	(Meant to be used after the games are stimulated)
	*/
	public void calculate(){
		for(int x = 0; x < m_games; x++){
			avgBattles += m_battles.get(x);
			avgWars += m_wars.get(x);
			avgDoubleWars += m_doubleWars.get(x);
			if(maxBattles < m_battles.get(x)){
				maxBattles = m_battles.get(x);
			}
			if(minBattles > m_battles.get(x) || minBattles == -1){
				minBattles = m_battles.get(x);
			}
			if(maxWars < m_wars.get(x)){
				maxWars = m_wars.get(x);
			}
			if(minWars > m_wars.get(x) || minWars == -1){
				minWars = m_wars.get(x);
			}
		}
		avgBattles/=m_games;
		avgWars/=m_games;
		avgDoubleWars/=m_games;
	}

	/**
	Displays the statistics from all the games
	(Meant to be implemented after calculate())
	*/
	public void report(){
		System.out.println("\nStatistics from playing War " + m_games + " times");
		System.out.printf("%-50s %-30d%n","Average number of battles per game: ", avgBattles);
		System.out.printf("%-50s %-30d%n","Average number of wars per game: ", avgWars);
		System.out.printf("%-50s %-30d%n","Average number of double wars per game: ", avgDoubleWars);
		System.out.printf("%-50s %-30d%n","Max number of battles in a game: ", maxBattles);
		System.out.printf("%-50s %-30d%n","Min number of battles in a game: ", minBattles);
		System.out.printf("%-50s %-30d%n","Max number of wars in a game: ", maxWars);
		System.out.printf("%-50s %-30d%n","Min number of wars in a game: ", minWars);
		System.out.println();
	}
}
