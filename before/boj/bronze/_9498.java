package boj.bronze;

import java.util.Scanner;

public class _9498 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		if (a > 89) {
			System.out.println("A");
		} else if (a > 79 && a < 90) {
			System.out.println("B");
		} else if (a > 69 && a < 80) {
			System.out.println("C");
		} else if (a > 59 && a < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
