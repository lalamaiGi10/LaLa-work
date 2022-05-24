package ex5;

public class Ex5_2 {

	public static void main(String[] args) {
		String title = "25日の予定";
		String address = "aaa@bbb.com";
		String text = "今日は6章に入ります。";
		email(title, address, text);

	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信した。");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}

}
