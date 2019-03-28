public class Zombie extends Undead{
	//Favorite zombie weapon
	private String weapon;

	public Zombie(){
		super();
		weapon = null;
	}

	public Zombie(String n, String o, int d, String w){
		super(n, o, d);
		weapon = w;
	}

	public String getWeapon(){
		return weapon;
	}

	public void setWeapon(String w){
		weapon = w;
	}
	
	public void speak(){
		System.out.println("UGGGHHHHHH");
	}

	public void diet(){
		System.out.println("Brains");
	}
}
