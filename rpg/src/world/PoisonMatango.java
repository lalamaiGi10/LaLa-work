package world;

public class PoisonMatango extends Matango {
	public int pcount = 5;
	
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	
	public void attack(Hero h) {
		super.attack(h);
		if (pcount != 0) {
			System.out.println("さらにどくをふりまいた！！");
			int damage = h.hp - damage;
			System.out.println(h.hp + "に" + damage + "のダメージ！！");
			System.out.println(h.name + "のHP: " + h.hp);
			pcount--;
			System.out.println("どくこうげきのこり" + pcount + "かい");
		}
	}
}
