package world;

public class Matango {
	public String name = "おばけキノコ";
	public int hp;
	public final int LEVEL = 10;
	public char suffix;

	public Matango() {
		this.suffix = 'A';
	}

	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public void attack(Hero h) {
		
	}

	public void run() {
		System.out.println(this.name + this.suffix + "はにげだした！！");
	}
}
