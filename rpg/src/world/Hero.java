package world;

public class Hero {// ←クラスブロック

	public String name;// このとき初期値はnullで入っている
//	ほかのパッケージにも見えるようにするため(パッケージまたぎで使うとき)
	public int hp;// このとき初期値は0で入っている

	public void attack() {
	}// メソッドブロック

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "はねむった。");
		System.out.println(this.name + "のHPがぜんかいふくした！");
	}

	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "はそのばでしゃがみこんだ！");
		System.out.println(this.name + "のHPが" + "sec" + "かいふくした！！");
	}

	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "はこけてしまった！");
		System.out.println(this.name + "のHPが" +this.hp +  "にへってしまった！！");

	}

	public void run() {
	}
}// ←クラスブロックの終わり
