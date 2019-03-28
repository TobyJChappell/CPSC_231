/*
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment Ch3_6

Outputs the weight of green crud in pounds given (by the user) an initial amount and a duration given in days.
It uses the Fibonacci sequence to calculate it's result, increasing the weight every 5 days by the addition of the last two numbers.
The calculation can be repeated as many times as the user sees fit.
*/
import java.util.Scanner;
public class Ch3_6{
	public static void main(String[] args){
		String answer = new String();
		Scanner s = new Scanner(System.in);
		do{
			System.out.println("\nPlease input the intial pounds of crud:");
			int size = s.nextInt();
			System.out.println("Please input the number of days:");
			int days = s.nextInt();
			int size2 = 0;
			int temp = 0;
				for(int x=0;x<=days;x+=5)
				{
						temp = size;
						size+=size2;
						size2=temp;
				}
				System.out.println("There would be " + size2 + " pounds of crud after " + days + " days.");
				System.out.println("\nWould you like to make another calculation? (yes/no)");
				s.nextLine();
				answer = s.nextLine().toLowerCase();
		} while(answer.equals("yes") || answer.equals("y"));
	}
}
