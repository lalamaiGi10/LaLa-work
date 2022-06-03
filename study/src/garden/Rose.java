package garden;

public class Rose extends Flower {
	// このフィールドを有効にすると、smell()は、このフィールドを参照する。
	// したがって、null となる。
	// しかし、このままだと、親クラスのフィールドを参照する。
	// したがって、花 となる。
//	 public String name;
	
	public Rose() {}
	
//	親フィールドに名前を設定する
	public Rose(String name) {
		super(name);
	}
	
	public void smell () {
		System.out.println(this.name + "はいい香りがする。");
	}
}
