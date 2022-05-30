package world;

import java.util.Random;

public class Cleric {
	public String name;
	int hp = 50;
	int mp = 10;
	final int MAX_HP = 50;
	final int MAX_MP = 10;

	public void selfAid() {
		this.mp -= 5;
		this.hp = MAX_HP; // 定数についてはthis.なしでもOK
		System.out.println(this.name + "はセルフエイドをとなえた！");
		System.out.println(this.name + "のHPがさいだいまでかいふくした！");
		System.out.println(this.name + "のMPが5へった！");
	}

	/**
	 * 聖職者は祈ることで自分のMPを回復可能 ただし、最大MPを超えることはない。
	 * 
	 * @param sec 祈る秒数
	 * @return int 回復量
	 */

	public int pray(int sec) {
		int hosei = new Random().nextInt(3);
		int kaifuku = sec + hosei;
		this.mp = this.mp + kaifuku;
		if (this.mp + kaifuku > MAX_MP) {
			kaifuku = MAX_MP - this.mp;
		}
		this.mp = this.mp + kaifuku;
		System.out.println(this.name + "は" + sec + "びょういのった!");
		System.out.println(this.name +"のMPが" + kaifuku +"かいふくした！！");
		return kaifuku;
	}
}
