package bronze;

import java.util.Scanner;

public class _2577 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		int multi = a*b*c;
		
		int[] array = new int[10];
		while(multi>0) {
			array[multi%10]++;
			multi = multi/10;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
