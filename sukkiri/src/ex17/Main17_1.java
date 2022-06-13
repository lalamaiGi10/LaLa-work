package ex17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main17_1 {

	public static void main(String[] args) throws Exception {
		String s = null;
		try {
			while(s == null) {
				System.out.print("文字を入力して > ");
				s = new Scanner(System.in).nextLine();
			}
		} catch (InputMismatchException e) {
			System.out.println("文字ちゃう！！");
		}
		System.out.println(s);
	}

}
