package chap15;

public class Main579 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
//		ここで何らかの処理
		try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
//				e.printStackTrace();
			System.out.println("エラー発生!!!");
			System.out.println(e.getMessage());
		}
		long end = System.currentTimeMillis();

		System.out.println("処理時間は…" + (end - start) + "ミリ秒でした。");
	}

}
