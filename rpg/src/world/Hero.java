package world;

public class Hero {// ←クラスブロック

	public String name = "みなと";// public String name;のとき初期値はnullで入っている
//	public String name;にするのはほかのパッケージにも見えるようにするため(パッケージまたぎで使うとき)
	public int hp = 100;
//	public int hp;// このとき初期値は0で入っている

	public Hero () {}
	public Hero (String name) {
		this.name = name;
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "のこうげき！！");
		m.hp -= 5;
		System.out.println("5のダメージ");
	}// メソッドブロック


	public void run() {
		System.out.println(this.name + "はにげだした！！");
	}
}// ←クラスブロックの終わり
