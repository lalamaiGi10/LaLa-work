package chap10;

import chap08.Matango;

public class Hero {
	String name = "みたこ";
	int hp = 100;

//	Sword sword;
	
	void attack(Matango M) {
	System.out.println(this.name + "のこうげき!");
	System.out.println("モンスターに5のダメージ!");
	}

	public void run() {
		System.out.println(this.name + "はにげだした!");
	}

//	void sit(int sec) {
//		this.hp += sec;
//		System.out.println(this.name + "はその場で" + sec + "秒しゃがんだ!");
//		System.out.println(this.name + "のHPが" + sec + "かいふくした!");
//	}

	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "はころんでしまった!");
		System.out.println(this.name + "のHPが" + this.hp + "になった!");
	}

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
