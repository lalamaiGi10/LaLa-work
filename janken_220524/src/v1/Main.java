package v1;

public class Main {

	public static void main(String[] args) {
		String userName = "";
		
		
		String[] hand = { "グー", "チョキ", "パー" };
		int com = new java.util.Random().nextInt(3);

		int user = userInput();

		System.out.println("PCの手は" + hand[com]);
		System.out.println("うちの手は" + hand[user]);

		hantei(com, user, userName);

	}

	public static void hantei(int com, int user, String name) {
		if (com == user) {
			System.out.println("あいこ!!");
		} else if (user + 1 == com || (user == 2 && com == 0)) {
			System.out.println(name + "の勝ち!!");
		} else {
			System.out.println(name + "の負け!!");
		}
	}

	public static int userInput() {
		System.out.println("0:グー 1:チョキ 2:パー");
		System.out.println("じゃんけん!!どの手を出す?数値で教えて!!");

		int user = new java.util.Scanner(System.in).nextInt();
		return user;
	}

}

//ユーザーにメッセージを出す

//userInputメソッド
//0ぐー1ちょき2ぱー
//数字で入力

//引数と戻り値を考えてみよう


//さらに応用
//make()
//int com = ランダム
//int userInput()
//return {com,user}