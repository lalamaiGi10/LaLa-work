package ex11;

public class Computer extends TangibleAsset{
	String makerName;
	
	public Computer (String name, int price, String color, String makerName) {
		super(name,price,color);
		this.makerName = makerName;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public String getMakerName() {
		return makerName;
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
