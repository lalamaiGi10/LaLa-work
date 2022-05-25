package ex5;

public class Ex5_4 {

	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		double area1 = calcTriangleArea(bottom, height);
		System.out.println("底辺:"+bottom+height+area1);
		calcCircleArea();

	}
	
	public static void calcTriangleArea(double bottom, double height) {
		return bottom * height / 2.0;
	}
	
	public static void main(String[] args) {
	}

}
