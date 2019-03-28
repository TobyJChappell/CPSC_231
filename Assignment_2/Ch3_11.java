/*
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment Ch3_11

Outputs three random winners from a group of 1-30 that cannot be identical
*/
public class Ch3_11{
	public static void main(String[] args){
		int[] winners = new int[3];
		int rand = (int)(Math.random()*30)+1;
		winners[0] = rand;
		while(rand==winners[0]){
			rand = (int)(Math.random()*30)+1;
		}
		winners[1] = rand;
		while(rand==winners[0] || rand==winners[1]){
			rand = (int)(Math.random()*30)+1;
		}
		winners[2] = rand;
		System.out.println("\nThe winners are finalists " + winners[0] + ", " + winners[1] + ", " + winners[2] + ".\n");
	}
}
