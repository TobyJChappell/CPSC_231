/*
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment Ch2_11

Calculates the total grade for three classroom exercises as a percentage. Also outputs a table that summarizes the scores.
*/
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ch2_11{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("00.00%");
    String[] names = new String[3];
    int[] scores = new int[3];
    int[] possible = new int[3];
    for(int x = 0; x < 3; x++){
      System.out.println("Name of excercise " + (x+1) + ":");
      names[x] = s.nextLine();
      System.out.println("Score received for exercise " + (x+1) + ":");
      scores[x] = s.nextInt();
      System.out.println("Total points possible for exercise " + (x+1) + ":");
      possible[x] = s.nextInt();
      s.nextLine();
    }
    int scoreTotal = scores[0] + scores[1] + scores[2];
    int possibleTotal = possible[0] + possible[1] + possible[2];
    System.out.printf("%n%-20s %-10s %-10s%n", "Exercise", "Score", "Total Possible");
    for(int x = 0; x < 3; x++){
      System.out.printf("%-20s %-10d %-10d%n", names[x], scores[x], possible[x]);
    }
		System.out.printf("%-20s %-10d %-10d%n", "Total", scoreTotal, possibleTotal);
    System.out.println("Your total is " + scoreTotal + " out of " + possibleTotal + ", or " + df.format((double)scoreTotal/possibleTotal) + ".");
  }
}
