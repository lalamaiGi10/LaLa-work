package chap16;

import java.util.ArrayList;

public class Main612 {

	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<>();
		System.out.println("size: " + points.size());
		points.add(10);
		points.add(80);
		points.add(75);
		System.out.println("size: " + points.size());
		for (int i : points) {
//			for(Integer i : points){}でも良い
//			for(int i = 0; i < points.size();i++) {
			System.out.println(i);
//			syso(points.get(i));
		}
		if (points.contains(80)) {
			System.out.println("あるで。");
		}
	}

}
