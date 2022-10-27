package bronze;

import java.util.Scanner;

public class _2675 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] r = new int[t];
		String[] s = new String[t];
		if(t>=1 && t<=1000) {
			for(int i = 0; i<t ; i++) {
				r[i] = scanner.nextInt();
				s[i] = scanner.next();
			}
			scanner.close();
			for(int i = 0;i<t ; i++) {
				for(int j = 0; j<s[i].length() ; j++) {
					for(int k = 0; k<r[i] ; k++) {
						System.out.print(s[i].charAt(j));
					}
				}
				System.out.println();
			}
		}
	}
}
