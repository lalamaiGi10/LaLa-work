package chap08;

import world.Hero;
import world.Matango;

public class Main307 {
	public static void main(String[] args) {
//		勇者、生まれろ！！
		Hero mitakoHero = new Hero();
		mitakoHero.name = "みたこ";
		mitakoHero.hp = 100;
		System.out.println("ゆうしゃ「" + mitakoHero.name + "」とうじょう！！");
//		staticではthis使えない

//		おばキノ、生まれろ！！
		Matango matango1 = new Matango();
		matango1.suffix = 'A';
		System.out.println(matango1.name + matango1.suffix + "があらわれた！！");
//		勇者、たたけ！！
//		おばキノ、逃げろ！！
	}
}
