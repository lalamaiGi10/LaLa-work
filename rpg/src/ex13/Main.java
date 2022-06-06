package ex13;

import world.Hero;
import world.Wand;
import world.Wizard;

public class Main {

	public static void main(String[] args) {
		Wizard w = new Wizard("すがわら");
		Wand wand = new Wand("まほうのつえ");
//		wand.setName("杖");
//		wand.setPower(0.3);
		
		Hero h =  new Hero("みなと"); 
		
		w.heal(h);

	}

}
