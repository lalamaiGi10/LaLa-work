package ex15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main15_3 {

	public static void main(String[] args) {
		Date nowDate = new Date();
		System.out.println("現在時刻: " + nowDate);
		Calendar c = Calendar.getInstance();
		c.setTime(nowDate);
		Date d = c.getTime();
		System.out.println(d);

		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("day: " + day);
		c.set(Calendar.DAY_OF_MONTH, day + 100);
		Date d2 = c.getTime();
		System.out.println("d2: "+ d2);
		SimpleDateFormat sdf = new SimpleDateFormat("西暦 yyyy年MM月dd日");
		System.out.println(sdf.format(d2));
	}

}
