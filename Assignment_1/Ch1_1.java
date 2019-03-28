/*
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment Ch1_1

Outputs the calories burned from a 150 pound man that runs 6 MPH for 30 min,
plays basketball for 30 min, and sleeps for 6 hours
*/
public class Ch1_1{
  public static void main(String args[]){
    double lb=150;
    double kg = lb/2.2;
    double cal = calPerMin(10,kg)*30;
    cal += calPerMin(8,kg)*30;
    cal += calPerMin(1,kg)*6*60;
    System.out.println("Calories Burned: " + cal);
  }

  public static double calPerMin(int MET, double kg){
    return .0175*MET*kg;
  }
}
