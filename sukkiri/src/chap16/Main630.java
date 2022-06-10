package chap16;

import java.util.HashSet;
import java.util.Set;

public class Main630 {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");

		for (String color : colors) {
			System.out.print(color + "→");
		}
	}

}
