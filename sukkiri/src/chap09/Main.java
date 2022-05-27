package chap09;

public class Main {

	public static void main(String[] args) {
		Hero h1;
		h1 = new Hero("よね");
		//コンストラクタで引数を受け取るようになったら()内に名前を入力する 
//		h1.hp = 100;
//		h1.name = "よね";

		Sword sword = new Sword();
		sword.name = "ほのおのつるぎ";
		sword.damage = 10;

		h1.sword = sword;

		System.out.println(h1.name + "のステータス");
		System.out.println("HP:" + h1.hp);
		System.out.println(h1.name + "は、" + h1.sword.name + "をそうびした!");
		System.out.println("--------");
		
		Hero h2;
		h2 = new Hero("つぶ");
		//コンストラクタで引数を受け取るようになったら()内に名前を入力する 
//		h2.name = "つぶ";
//		h2 = h1;
//		h2.hp = 100;
		System.out.println(h2.name + "のステータス");
		System.out.println("HP:" + h2.hp);
		System.out.println("--------");

		Wizard wizard;
		wizard = new Wizard();
		wizard.name = "この";
		wizard.hp = 50;
		System.out.println(wizard.name + "のステータス");
		System.out.println("HP:" + wizard.hp);
		System.out.println(wizard.name + "はヒールをとなえた!");
		wizard.heal(h1);
		wizard.heal(h1);
		wizard.heal(h2);
		System.out.println("--------");
		
		Thief thief = new Thief();
		System.out.println(thief.name + "がなかまにくわわった!");
		System.out.println("ど・ろ・ぼ・う?トレジャーハンターと言ってくれ!!");
	}

}
