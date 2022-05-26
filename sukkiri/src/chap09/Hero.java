package chap09;

public class Hero {

	String name;
	int hp;

	Sword sword;
	
	void attack() {
	System.out.println(this.name + "のこうげき!");
	System.out.println("モンスターに5のダメージ!");
	}

	void run() {
		System.out.println(this.name + "はにげだした!");
	}

	void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "はその場で" + sec + "秒しゃがんだ!");
		System.out.println(this.name + "のHPが" + sec + "かいふくした!");
	}

	void slip() {
		this.hp -= 5;
		System.out.println(this.name + "はころんでしまった!");
		System.out.println(this.name + "のHPが" + this.hp + "になった!");
	}

	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "はねむった!");
	}
	
//	コンストラクタ
//	newされたあとの自動実行メソッド
	Hero() {
		this.hp = 100;
	}

}
