package boj.bronze;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _10699 {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String sdfD = sdf.format(date);
		System.out.println(sdfD);
	}

}
