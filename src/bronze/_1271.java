package bronze;

import java.util.Scanner;

public class _1271 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if(x<y && x<10000 && y<10000) {
			int x1 = x/y;
			int y1 = x%y;
			System.out.println(x1);
			System.out.println(y1);
			scanner.close();
		}
	}
}
