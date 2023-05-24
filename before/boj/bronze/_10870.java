package boj.bronze;

import java.util.Scanner;

public class _10870 {
	public static int fibo(int n) {
		if(n == 0) return 0;
		if(n<2) return 1;
		else return fibo(n-1) + fibo(n-2);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int result = fibo(n);
		System.out.println(result);
		scanner.close();
	}

}
