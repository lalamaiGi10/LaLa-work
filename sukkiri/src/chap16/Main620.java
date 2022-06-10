package chap16;

import java.util.ArrayList;
import java.util.Iterator;

public class Main620 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
//		ArrayListはListと書かれることが圧倒的に多い
		names.add("みなと");
		names.add("あさか");
		names.add("すがわら");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {// 次のデータがあれば
			String s = it.next(); //データを取得
			System.out.println(s);
		}

	}

}
