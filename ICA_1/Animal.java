public abstract class Animal extends Monster{
	//Species of Animal
	private String species;

	public Animal(){
		super();
		species = null;
	}

	public Animal(String n, String o, String s){
		super(n, o);
		species = s;
	}

	public String getSpecies(){
		return species;
	}

	public void setSpecies(String s){
		species = s;
	}
}
