package chap15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main585 {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat f = new SimpleDateFormat("YYYY/MM/dd");
		Date d = f.parse("2020/09/22");
		System.out.println(d);
		
//		文字列からインスタンス生成
		Date now = new Date();
		String s = f.format(now);
		System.out.println(s);

	}

}
