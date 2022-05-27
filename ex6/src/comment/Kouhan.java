package comment;

public class Kouhan {
	public static void callDeae(){
		System.out.println("ええい、こしゃくな。くせ者だ!であえい!!");
	}

	public static void showMondokoro(){
		System.out.println("飛車さん、角さん。もういいでしょう。");
		System.out.println("この紋所が目に入らぬか!!!");
//		Thread.sleep(3000); // 3秒止める
		// ↑正式にはjava.util.Thread.sleep(3000);
		Zenhan.doTogame();
	}

}