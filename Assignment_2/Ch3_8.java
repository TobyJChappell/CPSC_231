/*
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment Ch3_8

Outputs the solutions to the equation "TOO + TOO + TOO + TOO = GOOD".
Each letter represents a number (0-9) unique from the letters.
*/
public class Ch3_8{
	public static void main(String[] args){
		System.out.println("\nThe solution to the cryptarithmetic puzzle:");
		System.out.println("'TOO + TOO + TOO + TOO = GOOD' is as follows.\n");
		for(int t = 0; t <= 9; t++){
			for(int o = 0; o <= 9; o++){
				for(int g = 0; g <= 9; g++){
					for(int d = 0; d <= 9; d++){
						int too = t*100 + o*11;
						int good = g*1000 + o*110 + d;
						if(too*4 == good && t!=o && t!=g && t!=d && o!=g && o!=d && g!=d){
							System.out.println("T = " + t + ", O = " + o + ", G = " + g + ", D = " + d);
						}
					}
				}
			}
		}
		System.out.println();
	}
}
