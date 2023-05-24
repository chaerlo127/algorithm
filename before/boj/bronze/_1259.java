package boj.bronze;

import java.util.Scanner;

public class _1259 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			boolean answer = true;
			String a = scanner.next();
			if(a.equals("0")) break;
			for(int i = 0; i< a.length()/2; i++) {
				if(a.charAt(i)!=a.charAt(a.length()-i-1)) {
					answer = false;
				}
			}
			if(answer) System.out.println("yes");
			else System.out.println("no");
		}
		scanner.close();
	}

}
