public abstract class Monster{
	//Name of monster
	private String name;
	//Origin of monster
	private String origin;

	public Monster(){
		name = null;
		origin = null;
	}

	public Monster(String n, String o){
		name = n;
		origin = o;
	}

	public String getName(){
		return name;
	}

	public void setName(String n){
		name = n;
	}

	public String getOrigin(){
		return origin;
	}

	public void setOrigin(String o){
		origin = o;
	}

	public abstract void speak();

	public abstract void diet();
}
