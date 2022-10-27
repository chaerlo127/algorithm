package bronze;

import java.util.Scanner;

public class _2439 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		for(int i = 1; i<=n ; i++) {
			for(int j = n; j>0 ; j--) {
				if(i<j) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
	}

}
