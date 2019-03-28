/*
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment Ch1_8

Reformatted version of code given in problem
*/
public class Ch1_8{
  public static final double DISTANCE = 6.21;
  public static void main(String[] args){
    System.out.println("This program calculates your pace given a time and distance traveled.");
    double time = 35.5; //35 minutes and 30 seconds
    double pace = time/DISTANCE;
    System.out.println("Your pace is " + pace + " miles per hour.");
  }
}
