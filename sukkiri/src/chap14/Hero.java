package chap14;

public class Hero {
	public String name;
	public int hp;
	public static int money;
	
	public static void setRandomMoney() {
		Hero.money = (int)
	}
	
	
	
	
	
	
	
	
	
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
//		このオブジェクトがヒーロー型に変えられそうなら
		if (o instanceof Hero) {
			Hero h = (Hero) o;
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
}