/*
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment Ch2_2

Outputs the pig latin of a user-inputted name
*/
import java.util.Scanner;
public class Ch2_2{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Please input your first name:");
    String first = s.next().toLowerCase();
    System.out.println("Please input your last name:");
    String last = s.next().toLowerCase();
    String firstPig = first.substring(1,2).toUpperCase()+first.substring(2)+first.charAt(0)+"ay";
    String lastPig = last.substring(1,2).toUpperCase()+last.substring(2)+last.charAt(0)+"ay";
    System.out.println("Your name in pig latin is:");
    System.out.println(firstPig + " " + lastPig);
  }
}
