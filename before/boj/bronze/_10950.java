package boj.bronze;

import java.util.Scanner;

public class _10950 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		int[] output = new int[t];
		for(int i = 0; i < t ; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if((a>0&&a<10) && (b>0&&b<10)) {
				output[i] = a+b;
			}
		}
		scanner.close();
		for(int i = 0; i<t ; i++) {
			System.out.println(output[i]);
		}
	}

}
