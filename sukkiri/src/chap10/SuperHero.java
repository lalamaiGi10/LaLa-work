package chap10;

public class SuperHero extends Hero {
//	String name = "みたこ";
	int hp = 100;
	boolean flying;
	
	public void fly() {
		this.flying = true;
		System.out.println("ちゅうにういた!");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("ちゃくちした!");
	}

	public void run() {
		System.out.println(this.name + "はてったいした!");
	}
	
	//	Sword sword;
	
	public void attack(Matango matango) {
	System.out.println(this.name + "のこうげき!");
	matango.hp = -5;
	System.out.println("モンスターに5のダメージ!");
	if (this.flying) {
		System.out.println(this.name + "のこうげき！！");
		matango.hp -= 5;
		System.out.println("さらに5のダメージ！！");
	}
	}


	
//	void sit(int sec) {
//		this.hp += sec;
//		System.out.println(this.name + "はその場で" + sec + "秒しゃがんだ!");
//		System.out.println(this.name + "のHPが" + sec + "かいふくした!");
//	}
//
//	void slip() {
//		this.hp -= 5;
//		System.out.println(this.name + "はころんでしまった!");
//		System.out.println(this.name + "のHPが" + this.hp + "になった!");
//	}
//
//	void sleep() {
//		this.hp = 100;
//		System.out.println(this.name + "はねむった!");
//	}
	
//	コンストラクタ(引数あり)
//	newされたあとの自動実行メソッド
//	public Hero(String name) {
//		this.hp = 100;
//		this.name = name;
//	}

//	コンストラクタ(引数なし)
//	newされたあとの自動実行メソッド
//	public Hero() {
//		this.hp = 100;
//		this.name = "名もなき戦士";
//	}

}
