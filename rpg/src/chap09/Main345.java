package chap09;

import world.Hero;
import world.Wizard;

public class Main345 {

	public static void main(String[] args) {
		Hero mitakoHero = new Hero();
		mitakoHero.name = "みたこ";
		mitakoHero.hp = 100;
				
		mitakoHero.slip();

		
		Wizard mamanoWizard = new Wizard();
		mamanoWizard.name = "ままの";
		mamanoWizard.hp = 120;
		
		mamanoWizard.heal(mitakoHero);
	}

}
