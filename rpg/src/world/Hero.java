package world;

public class Hero {
	private int hp;
	private String name;
	private Sword sword;

	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}

	public Hero(String name) {
		this.name = name;
	}

//	getter
	public int getHp() {
		return this.hp;
	}
	
//	setter
	public void setHp(int hp) {
		this.name = name;
	}
	
//	getter
	public String getName() {
		return this.name;
	}
	
//	setter
	public void setName(String name) {
		this.name = name;
	}

	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "はねむって、HPをかいふくした！！");
	}

	private void die() {
		System.out.println(this.name + "はきをうしなった！！");
	}

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃!");
		m.hp = m.hp - 5;
		System.out.println("敵に5ポイントのダメージを与えた。");
		
		System.out.println("おばけキノコ"+m.suffix+"から2のダメージ！！");
		this.hp= this.hp -= 2;
		if (this.hp <= 0) {
			this.die();
		}
	}

	public void run() {
		System.out.println(this.name + "は、逃げ出した");
	}
}
