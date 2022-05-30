package chap09;

import world.Hero;
import world.Sword;

public class Main343 {

	public static void main(String[] args) {
		Sword fireSword = new Sword();
		fireSword.name = "ほのおのつるぎ";
		fireSword.damage = 10;

		Hero mitakoHero = new Hero();
		mitakoHero.name = "みたこ";
		mitakoHero.hp = 100;
		mitakoHero.sword = fireSword;
		System.out.println(mitakoHero.name + "は" + mitakoHero.sword.name + "をそうびした！！");
	
	mitakoHero.attack();
	}

}
