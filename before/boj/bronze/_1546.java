package boj.bronze;

import java.util.Scanner;

public class _1546 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double[] a = new double[1000];
		double max = 0;
		double avg = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextDouble();
			if (a[i] > max) {
				max = a[i];
			}
		}
		scanner.close();

		for (int i = 0; i < n; i++) {
			avg += ((a[i] / max) * 100) / n;
		}
		System.out.println(avg);
	}

}
