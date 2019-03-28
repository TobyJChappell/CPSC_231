public class Werewolf extends Animal{
	//Days left until transformation
	private int daysLeft;

	public Werewolf(){
		super();
		daysLeft = 0;
	}

	public Werewolf(String n, String o, String s, int d){
		super(n, o, s);
		daysLeft = d;
	}

	public int getDaysLeft(){
		return daysLeft;
	}

	public void setDaysLeft(int d){
		daysLeft = d;
	}
	
	public void speak(){
		System.out.println("AWOOOOOOOOOOO");
	}

	public void diet(){
		System.out.println("Flesh");
	}
}
