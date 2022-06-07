package chap14;

public class Main535 {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "みなと";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "みなと";
		h2.hp = 100;
		
		if(h1.equals(h2) == true) {
			System.out.println("おなじ");
		} else {
			System.out.println("ちゃう");
		}
	}

}
