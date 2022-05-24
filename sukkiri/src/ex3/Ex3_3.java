package ex3;
import java.util.Scanner;

public class Ex3_3 {
	public static void main (String[] args) {
		System.out.println("おなか空いてる？");
		Scanner scan =new Scanner(System.in);
		int isHungry = scan.nextInt();
		String food = "チョコレート";

		System.out.println("ちーす!!");

		if(isHungry == 0) {
			System.out.println("おなかいっぱい!!");
		} else {
			System.out.println("腹ペコ!!"+ food + "食べるし!!");
		}
		// String msg = (isHungry == 0) ? "おなかいっぱい!!" : "腹ペコ!!";
		// 三項演算子
		// ?までの内容→条件式
		// ?の後ろから:の直前まで→真の場合
		// :の後ろから→偽の場合
	}
}