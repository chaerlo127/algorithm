package bronze;

import java.util.Scanner;

public class _1157 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.next();
		scanner.close();
		int[] alpha = new int[26];
		
		for(int i = 0; i<sentence.length(); i++) {
			if('a'<=sentence.charAt(i)&& sentence.charAt(i)<='z') {
				alpha[sentence.charAt(i)-'a']++;
			}else if('A'<=sentence.charAt(i)&& sentence.charAt(i)<='Z') {
				alpha[sentence.charAt(i)-'A']++;
			}
		}
		
		int max = -100;
		char answer = 'x';
		for(int i = 0; i<alpha.length; i++) {
			if(alpha[i]>max) {
				max = alpha[i];
				answer = (char) (i+65);
			}else if(alpha[i] == max){
				answer = '?';
			}
		}
		System.out.println(answer);
	}

}
