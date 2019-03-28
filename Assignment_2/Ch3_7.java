/*
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment Ch3_7

Allows the user to calculate e^x provided some x value using the equation 1 + x + x^2/2! + x^3/3! + ... + x^n/n!.
Shows the output when n = 1-10, 50, and 100.
The calculation can be repeated as many times the user wants.
*/
import java.util.Scanner;
public class Ch3_7{
	public static void main(String[] args){
		String answer = new String("y");
		Scanner s = new Scanner(System.in);
		System.out.println("\nThis program allows you to calculate the value e^x using the equation \"1 + x + x^2/2! + x^3/3! + ... + x^n/n!\"");
		while(answer.equals("yes")||answer.equals("y")){
			System.out.println("\nPlease input a value x to calculate e^x:");
			int x = s.nextInt();
			System.out.println();
			for(int i = 1; i<=10; i++){
				System.out.println("n=" + i + ": "  + e(x,i));
			}
			System.out.println("n=50: " + e(x,50));
			System.out.println("n=100: " + e(x,100) + "\n");
			System.out.println("Would you like to make another calculation? (yes/no)");
			s.nextLine();
			answer = s.next();
		}
	}
	public static double e(int x, int n){
		double sum = 0;
		double factorial = 0;
		for(int i = 0; i < n; i++){
			factorial = 1;
			for(int j = 1; j <= i; j++){
				factorial*=j;
			}
			sum+=(double)Math.pow(x,i)/factorial;
		}
		return sum;
	}
}
