package boj.bronze;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _1152 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		scanner.close();
		
		StringTokenizer st = new StringTokenizer(sentence, " ");
		System.out.println(st.countTokens());
	}

}
