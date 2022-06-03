package garden;

public class Flower {
	public String name;

//	newするとき暫定的に花という名前を付けておく
	public Flower() {
		this.name = "花";
	}
	
//	newするとき花名を付けられる
	public Flower(String name) {
		this.name = name;
	}
	
	public void bloom() {
		System.out.println(this.name + "が咲いた。");
	}
}
