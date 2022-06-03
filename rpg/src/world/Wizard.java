package world;

public class Wizard extends Character {
	public int mp;
	
	public void heal(Hero h) {
//		h.hp = h.hp + 10;
		System.out.println(h.getName() + "のHPを10回復した。");
	}

	@Override
	public void attack(Matango m) {
		System.out.println(this.name + "のこうげき！");
		System.out.println("敵に3のダメージ！！");
		m.hp -= 3; 
	}
	
	public void fireball(Matango m) {
		System.out.println(this.name + "はひのたまをはなった！");
		System.out.println("敵に20のダメージ！！");
		m.hp -= 20;
		this.mp -= 5;
	}
}
