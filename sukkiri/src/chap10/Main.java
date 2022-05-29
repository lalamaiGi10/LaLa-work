package chap10;

public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name = "みたこ";
		hero.hp = 100;
		System.out.println("ゆうしゃ「" + hero.name + "」とうじょう!");
		System.out.println("ゆうしゃ「" + hero.name + "」のステータス");
		System.out.println("HP:" + hero.hp);
		System.out.println("--------");

		Matango matango1 = new Matango();
		matango1.hp = 50;
		matango1.suffix = 'A';

		Matango matango2 = new Matango();
		matango2.hp = 48;
		matango2.suffix = 'B';
		
//		Cleric cleric = new Cleric();
//		cleric.name = "ぬっく";
//		cleric.hp = cleric.MAX_HP;
//		cleric.mp = cleric.MAX_MP;
//		System.out.println("そうりょ「" + cleric.name + "」がなかまにくわわった!");
//		System.out.println("そうりょ「" + cleric.name + "」のステータス");
//		System.out.println("HP:" + cleric.hp + ", MP:" + cleric.mp);
//		System.out.println("--------");

//		
		SuperHero sh = new SuperHero();
		sh.run();
		sh.fly();
		System.out.println("--------");
		
//		ゆうしゃおでかけ
//		hero.sit(5);
//		hero.slip();
//		hero.sit(25);
//		hero.run();

//		エンカウント
//		System.out.println("まもののむれがあらわれた!");
//		hero.slip();
//		cleric.liquor(1);

		System.out.println("まもののむれはおどろきとまどっている!");
		matango1.run();
		matango2.run();
		hero.run();
		System.out.println("--------");
		
//		いろいろかいふく
//		cleric.selfAid();
//		cleric.pray(1);
	}

}
