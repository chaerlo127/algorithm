package bronze;

import java.util.Scanner;

public class _2438 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String x = "*";
		for(int i = 0; i<n; i++) {
			System.out.println(x);
			x = x + "*";
		}
		scanner.close();
	}

}
