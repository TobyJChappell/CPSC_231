public class Vampire extends Undead{
	//Number of humans eaten
	private int humans;

	public Vampire(){
		super();
		humans = 0;
	}

	public Vampire(String n, String o, int d, int h){
		super(n, o, d);
		humans = h;
	}

	public int getHumans(){
		return humans;
	}

	public void setHumans(int h){
		humans = h;
	}

	public void speak(){
		System.out.println("I will suck your blood");
	}

	public void diet(){
		System.out.println("Blood");
	}
}
