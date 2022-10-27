package boj.bronze;
import java.util.Scanner;

public class _2750 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] a = new int[num];
		for(int i = 0; i<num; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		
		for(int i = 0; i<num-1; i++) {
			for(int j = i; j<num; j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i<num ; i++) {
			System.out.println(a[i]);
		}
		
	}

}
