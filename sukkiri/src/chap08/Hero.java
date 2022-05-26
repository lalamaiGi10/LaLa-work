package chap08;

public class Hero {

	String name;
	int hp;

	void attack() {
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

}
