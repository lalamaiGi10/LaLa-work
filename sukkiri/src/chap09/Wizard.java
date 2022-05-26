package chap09;

public class Wizard {
	String name;
	int hp;
	
	void heal(Hero h1) {
		h1.hp += 10;
		System.out.println(h1.name + "のHPを10かいふくした!");
	}
}
