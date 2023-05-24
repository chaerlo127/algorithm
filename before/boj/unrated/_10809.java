package boj.unrated;

import java.util.Scanner;

public class _10809 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		int[] wordArray = new int[26];
		for(int i = 0; i< wordArray.length; i++) {
			wordArray[i] = -1;
		}
		for(int i = 0; i < word.length(); i++) {
			int a = word.charAt(i)-'a';
			if(wordArray[a] == -1) {
				wordArray[a] = i;
			}
		}
		for(int i = 0; i<wordArray.length; i++) {
			System.out.print(wordArray[i] + " ");
		}
		scanner.close();

	}

}
