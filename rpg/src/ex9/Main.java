package ex9;

import world.Thief;

public class Main {

	public static void heal(int hp) {
		hp = hp + 10;
	}

	public static void heal(Thief thief) {
		thief.hp = thief.hp + 10;
	}

	public static void main(String[] args) {
		int baseHp = 25;
		
		Thief thief = new Thief("みたこ",baseHp);
		System.out.println(baseHp + " : " + thief.hp);
		
		heal(baseHp);
		heal(thief);
		System.out.println(baseHp + " : " + thief.hp);
		

		Thief thief06 = new Thief("ロック", 128, 5);
		Thief thief09 = new Thief("ジタン", 128);
		Thief thief10 = new Thief("リュック");

		System.out.println(thief06.name + "登場！");
		System.out.println(thief06.name + "のステータス【HP:" + thief06.hp + ",MP:" + thief06.mp + "】");
		System.out.println(thief06.name + ":ど・ろ・ぼ・う？ トレジャーハンターといってくれ！");

		System.out.println(thief09.name + "登場！");
		System.out.println(thief09.name + ":誰かを助けるのに理由がいるかい？");

		System.out.println(thief10.name + "登場！");
		System.out.println(thief10.name + ":ちょいちょいっとね！");
	}

}
