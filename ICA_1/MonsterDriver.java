import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MonsterDriver{
	public static void main(String[] args) {
		ArrayList<Monster> monsterList = new ArrayList<Monster>();
		monsterList.add(new Zombie("Frankenstein", "Germany", 1818, "Pointy Stick"));
		monsterList.add(new Zombie("Billy Butcherson", "Hocus Pocus", 1693, "Knife"));
		monsterList.add(new Zombie("Michael Jackson", "Thriller", 1982, "Dance"));
		monsterList.add(new Zombie("Solomon Grundy", "DC Comics", 1895, "Chains"));
		monsterList.add(new Vampire("Dracula", "Transylvania", 1431, 999999));
		monsterList.add(new Vampire("Count von Count", "Sesame Street", -1832652, 0));
		monsterList.add(new Vampire("Count Chocula", "General Mills", 1971, -100000));
		monsterList.add(new Werewolf("Remus Lupin", "Hogwarts", "Wizard", 12));
		monsterList.add(new Werewolf("Jack Russell", "Marvel Comics", "Human", 6));
		monsterList.add(new Werewolf("Mason Greyback", "Wizards of Waverly Place", "Wizard", 13));
		Collections.shuffle(monsterList);
		for(int x = 0; x < monsterList.size(); x++){
			Monster m = monsterList.get(x);
			System.out.println("\nName: " + m.getName());
			System.out.print("Type: ");
			if(m instanceof Zombie){
				System.out.println("Zombie");
			}
			else if(m instanceof Vampire){
				System.out.println("Vampire");
			}
			else if(m instanceof Werewolf){
				System.out.println("Werewolf");
			}
			else{
				System.out.println("Monster");
			}
			System.out.print("Favorite Saying: ");
			m.speak();
			System.out.print("Diet: ");
			m.diet();
			if(m instanceof Zombie){
				System.out.println("Favorite Weapon: " + ((Zombie) m).getWeapon());
			}
			else if(m instanceof Vampire){
				System.out.println("Number of Humans Feasted on: " + ((Vampire) m).getHumans());
			}
			else if(m instanceof Werewolf){
				System.out.println("Number of Days Left Till Transformation: " + ((Werewolf) m).getDaysLeft());
			}
		}
		System.out.println();
	}
}
