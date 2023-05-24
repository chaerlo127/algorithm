package boj.bronze;

import java.util.Scanner;

public class _10872 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		if(n>=0 && n<=12) {
			int x = fact(n);
			System.out.println(x);
		}
	}

	private static int fact(int n) {
		if(n == 1 || n ==0) return 1;
		else return n * fact(n-1);
	}
}
