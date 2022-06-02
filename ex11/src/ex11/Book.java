package ex11;

public class Book extends TangibleAsset {
	String isbn;
	double weight;

	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	@Override
	public double getWeight() {
		// TODO 自動生成されたメソッド・スタブ
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
		
	}
	
	
}
