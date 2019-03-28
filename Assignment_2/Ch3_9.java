/*
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment Ch3_9

Outputs the total score given some number of excercises, the scores
recieved and that were possible for each of those excercises.
*/
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ch3_9{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("00.00%");
    int score = 0;
    int possible = 0;
		System.out.println("\nHow many exercises to input:");
		int exercises = s.nextInt();
    for(int x = 1; x <= exercises; x++){
      System.out.println("Score received for exercise " + x + ":");
      score+= s.nextInt();
      System.out.println("Total points possible for exercise " + x + ":");
      possible+= s.nextInt();
    }
    System.out.println("Your total is " + score + " out of " + possible + ", or " + df.format((double)score/possible) + ".\n");
	}
}
