public abstract class Undead extends Monster{
	//Year heart stopped beating
	private int deathDate;

	public Undead(){
		super();
		deathDate = 0;
	}

	public Undead(String n, String o, int d){
		super(n, o);
		deathDate = d;
	}

	public int getDeathDate(){
		return deathDate;
	}

	public void setDeathDate(int d){
		deathDate = d;
	}
}
