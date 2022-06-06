package world;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public Wizard(String name) {
		this.name = name;
	}
	
//	13-4の問題コンストラクタで杖なしをありえなくする
//	setWandメソッドを読んでしまう
	public Wizard(Wand wand) {
		setWand(wand);
	}

	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した。");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		}
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("MPがマイナス値!!処理中断!!!");
		}
		this.mp = mp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前が空っぽ!!処理中断!!!");
		}
		if (name.length() <= 2) {
			throw new IllegalArgumentException("名前が短すぎ!!処理中断!!!");
		}
		this.name = name;
	}

	public Wand getWand() {
		return wand;
	}

	public void setWand(Wand wand) {
		this.wand = wand;
	}

//	@Override
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
