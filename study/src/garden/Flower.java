package garden;

public class Flower {
	private String fname;

//	newするとき暫定的に花という名前を付けておく
	public Flower() {
		this.fname = "花";
	}
	
//	newするとき花名を付けられる
	public Flower(String name) {
		this.fname = name;
	}
	
	public void bloom() {
		System.out.println(this.fname + "が咲いた。");
	}

	public String getName() {
		return fname;
	}

	public void setName(String name) {
		this.fname = name;
	}
	
	public Leaf makeLeaf() {
		Leaf l = new Leaf("葉っぱ");
		return l;

	}
	
	class Leaf {
		private String name;
		public Leaf (String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
	}
}


// 下のコードは一緒に書かせてください

