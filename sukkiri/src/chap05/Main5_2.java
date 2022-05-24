package chap05;

public class Main5_2 {
//	static int x;クラス変数のやり方(28行目のadd()のint xとint y不要になる)
//	static int y;クラス変数のやり方(13・14行目はintなしで宣言できる)

	public static void main(String[] args) {
		System.out.println("メソッドの呼び出し開始!!");
		String msg = "ゴローさん、こんにちは";
		hello(msg);
//		hello("アサカ");
		System.out.println("メソッドの呼び出し完了!!");
		int x = 100;
		int y = 10;
//		int ans =add(x,y);
		System.out.println(x+"+"+y+"="+add(x,y));
	}

//	public static void hello(String name) {
//		System.out.println(name + "さん、ちわッス");
//	}

	public static void hello(String message) {
		System.out.println(message);
	}
//	ここの変数名はmsgのことだが、messageとしていても大丈夫
//	実引数と仮引数は名前が違っても大丈夫

	public static int add(int x, int y) {
		int ans = x + y;
		return ans;//処理が終わることも意味する
	}
}
