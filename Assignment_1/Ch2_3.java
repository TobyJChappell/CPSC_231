/*
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment Ch2_3

Outputs the sum, difference, and product of two numbers inputted by the user
*/
import java.util.Scanner;
public class Ch2_3{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Please input a number:");
    int x = s.nextInt();
    System.out.println("Please input another number:");
    int y = s.nextInt();
    System.out.println(x + " + " + y + " = " + (x+y));
    System.out.println(x + " - " + y + " = " + (x-y));
    System.out.println(x + " * " + y + " = " + (x*y));
  }
}
