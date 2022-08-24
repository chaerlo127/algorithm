package unrated;

import java.util.Scanner;

public class _2742 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int size = a;
		for(int i = 0; i<size; i++) {
			System.out.println(a);
			a--;
		}
	}

}
