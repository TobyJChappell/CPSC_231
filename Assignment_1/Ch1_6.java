/*
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment Ch1_6

Calculates the speed of a biker using a 100 inch gear size and a cadence of 90
*/
public class Ch1_6{
  public static void main(String args[]){
    int gearSize=100;
    int cadence=90;
    double speed = (double)gearSize*Math.PI/12/5280*cadence*60;
    System.out.println("Speed: " + speed + " mph");
  }
}
