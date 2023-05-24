package boj.sliver;

import java.util.Scanner;

public class _10974 {
	static int a;
	static int[] array;
	static boolean[] check;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		scanner.close();
		array = new int[a];
		check = new boolean[a];
		dsf(0);
	}
	
	private static void dsf(int count) {
		if(count == a) {
			for(int i = 0; i<a ; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}else {
			for(int i = 0; i<a; i++) {
				if(check[i]) continue;
				else {
					check[i] = true;
					array[count] = i+1;
					dsf(count+1);
					check[i] = false;
				}
			}
		}
	}
}
