/*
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment Ch2_8

Outputs the a line of text inputted by the user first in all uppercase letters and then in all lowercase letters
*/
import java.util.Scanner;
public class Ch2_8{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Please input a line of text:");
    String input = s.nextLine();
    System.out.println(input.toUpperCase());
    System.out.println(input.toLowerCase());
  }
}
