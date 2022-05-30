package ex8;

import world.Cleric;

public class Main {

	public static void main(String[] args) {
		Cleric nukCleric = new Cleric();
		nukCleric.name = "ぬっく";
		
		nukCleric.selfAid();
		nukCleric.pray(2);
	}

}
