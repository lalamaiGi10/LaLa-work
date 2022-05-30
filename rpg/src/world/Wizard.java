package world;

public class Wizard {
	public String name;
	public int hp;
	
	public void heal(Hero mitakoHero) {
		mitakoHero.hp += 10; 
		System.out.println(mitakoHero.name + "のHPを10かいふく！！");
	}
}
