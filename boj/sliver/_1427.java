package boj.sliver;

import java.util.Arrays;
import java.util.Scanner;

public class _1427 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] x = scanner.nextLine().toCharArray();
		scanner.close();

		Arrays.sort(x);
		
		for(int j = x.length-1; j>=0 ; j--) {
			System.out.print(x[j]);
		}
	}

}
