/*
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment Ch3_10

The game of Pig is a simple two-player dice game in which the first player to reach 100 or more points wins.
Players take turns. On each turn, a player rolls a six-sided die. If the player rolls a 1 the player's turn is over and no points are added.
Otherwise, the player has the option to ROLL AGAIN or HOLD  (in which case the player's turn is over and all points accumulated to their score).
This program allows a user to play the game of Pig with the computer where the computer follows the instructions to keep rolling until import junit.framework.TestCase;
has reached a total of 20 points and is then instructed to hold.
*/
import java.util.Scanner;
public class Ch3_10{
	static int pScore = 0;
	static int cScore = 0;
	public static void main(String[] args){
		System.out.println();
		while(pScore < 100 && cScore < 100){
			pTurn();
			System.out.println("PLAYER's Score: " + pScore + "   COMPUTER's Score: " + cScore + "\n");
			if(pScore < 100){
				cTurn();
				System.out.println("PLAYER's Score: " + pScore + "   COMPUTER's Score: " + cScore + "\n");
			}
		}
		if(pScore > cScore){
			System.out.println("PLAYER wins!\n");
		}
		else{
			System.out.println("COMPUTER wins!\n");
		}
	}

	public static void pTurn(){
		Scanner s = new Scanner(System.in);
		int temp = 0;
		int dice = 0;
		boolean notOne = true;
		System.out.println("It is your turn to ROLL (r):");
		char input = s.next().charAt(0);
		while(notOne && input=='r'){
			dice = (int)(Math.random()*6)+1;
			temp+=dice;
			System.out.println("PLAYER's Roll: " + dice);
			if(dice == 1){
				notOne = false;
			}
			else{
				System.out.println("Would you like to ROLL AGAIN or HOLD? (r/h)");
				input = s.next().charAt(0);
			}
		}
		System.out.println();
		if(notOne){
			pScore+=temp;
			System.out.println("PLAYER gained " + temp + " points from that run.");
		}
		else{
			System.out.println("PLAYER rolled a one, no points added.");
		}
		System.out.println();
	}

	public static void cTurn(){
		int temp = 0;
		int dice = 0;
		boolean notOne = true;
		while(notOne && temp<=20){
			dice = (int)(Math.random()*6)+1;
			System.out.println("COMPUTER's Roll: " + dice);
			if(dice==1){
				notOne = false;
			}
			else{
				temp+=dice;
			}
		}
		System.out.println();
		if(notOne){
			cScore+=temp;
			System.out.println("COMPUTER gained " + temp + " points from that run.");
		}
		else{
			System.out.println("COMPUTER rolled a one, no points added.");
		}
		System.out.println();
	}
}
