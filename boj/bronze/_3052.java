package bronze;

import java.util.Scanner;

public class _3052 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int[] a = new int [10];
		for(int i = 0; i<10 ; i++) {
			input = scanner.nextInt();
			a[i] = input%42;
		}
		scanner.close();
		
		int countPer = 0;
		for(int i = 0; i<10 ; i ++) {
			int count = 0;
			for(int j = i+1; j<10 ; j++) {
				if(a[i] == a[j]) {
					count++;
				}
			}
			if(count == 0) countPer++;
		}
		System.out.println(countPer);
	}
}
