/**
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment 4

Driver for the StudentRecord class
*/

public class StudentRecordDriver{
	public static void main(String[] args){
		StudentRecord s1 = new StudentRecord(20, 75, 90);
		System.out.println("\nOverloaded -  " + s1.toString() + "\n");
		StudentRecord s2 = new StudentRecord();
		System.out.println("Default -  " + s2.toString() + "\n");
		s2.setQuizzes(25);
		s2.setMidterm(80);
		s2.setFinal(95);
		System.out.println("Modified -  " + s2.toString() + "\n");
		if(s1.equals(s2)){
			System.out.println("S1 and S2 are equal.");
		}
		else{
			System.out.println("S1 and S2 are not equal.");
		}
		System.out.println();
	}
}
