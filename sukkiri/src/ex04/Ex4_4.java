package ex04;

public class Ex4_4 {

	public static void main(String[] args) {
//		int[] numbers = { 3, 4, 9 };
		int[]numbers = new int[2];
		numbers[0] = new java.util.Random().nextInt(9)+1;
//		numbers[1] = new java.util.Random().nextInt(9)+1;
		
		do {
			numbers[1] = new java.util.Random().nextInt(9)+1;
		}while (numbers[0] == numbers[1]);
		
		System.out.println("1桁の数値を入力");
		int input = new java.util.Scanner(System.in).nextInt();
		
		for (int num : numbers) {
			if(input == num) {
				System.out.println("あたり!");
				break;
			} else {
				System.out.println("はずれ!");
			}
		}
	}

}
