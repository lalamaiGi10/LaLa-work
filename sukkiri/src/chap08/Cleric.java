package chap08;

public class Cleric {
	String name;
	int hp;
	int mp;
	final int MAX_HP = 50;
	final int MAX_MP = 10;

//	まほうセルフエイド(HPぜんかいふく)
	void selfAid() {
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println(this.name + "はひざをついてセルフエイドをとなえた!");
		System.out.println(this.name + "のHPがぜんかいふくした!");
		System.out.println(this.name + "のHP:" + this.hp);
	}

//	いのる(MPかいふく)
	void pray(int sec) {
		System.out.println(this.name + "はめをとじておいのりした!");
		int ramPoint = new java.util.Random().nextInt(3);
		this.mp += this.mp + sec + ramPoint;
		if (this.mp >= MAX_MP) {
			this.mp = this.MAX_MP;
		System.out.println(this.name+"のMPがぜんかいふくした!");
		} else {
			this.mp = this.mp;
			System.out.println(this.name+"のMPがかいふくした!");
		}
		System.out.println(this.name + "のMP:" + this.mp);
	}

//	ビールのむ(MPさがる)
	void liquor(int bit) {
		this.mp -= bit;
		System.out.println(this.name + "はそれをみて、すわってビールを" + bit + "くちのんだ!");
		System.out.println(this.name + "のMPが" + bit + "さがった!");
		System.out.println(this.name + "のMP:" + this.mp);
	}
}
