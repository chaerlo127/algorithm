package bronze;

import java.util.Scanner;

public class _2420 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long j = scanner.nextLong();
		
		System.out.println(Math.abs(j-n));
		scanner.close();
	}

}
