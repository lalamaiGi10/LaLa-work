package chap12;

import world.Character;
import world.Matango;
import world.Wizard;

public class Main471 {

	public static void main(String[] args) {
//		Wizard w = new Wizard();
		Character c = new Wizard();
		if (c instanceof Wizard) {
			System.out.println("ゆるす！");
		}
		Wizard w = (Wizard) c;// キャスト演算子でWizardと見なせ！！
		Matango m = new Matango();
		c.name = "あさか";
		c.attack(m);
		c.fireball(m);

//		if (c instanceof Hero) {
//			Hero h = (Hero) c;
//			h.attack(m);
//		} else {
//			System.out.println("あかん！");
//			System.out.println("cのインスタンスはHeroちゃうから！！");
//		}
	}

}
