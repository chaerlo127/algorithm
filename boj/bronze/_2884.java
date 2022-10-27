package boj.bronze;
import java.util.Scanner;

public class _2884 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
		int min = scanner.nextInt();
		
		if(min <45) {
			if(hour == 0) {
				hour = 23;
			}else hour = hour -1;
			min = 60+min -45;
		}else {
			min = min - 45;
		}
		System.out.println(hour + " " + min);
	}

}
