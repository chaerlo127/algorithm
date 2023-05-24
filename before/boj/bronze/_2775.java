package boj.bronze;

import java.util.Scanner;

public class _2775 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		int[][] apart = new int[15][15];
		
		for(int i = 0; i<15; i++) {
			apart[0][i] = i;
			apart[i][1] = 1;
		}
		
		for(int i = 1; i<15; i++) {
			for(int j = 2; j<15; j++) {
				apart[i][j] = apart[i-1][j] + apart[i][j-1];
			}
		}
		
		for(int i = 0; i<T; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			System.out.println(apart[x][y]);
		}
		scanner.close();
	}
}
