package boj.sliver;

import java.util.Scanner;
import java.util.Stack;

public class _9012 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int a = scanner.nextInt();
			for(int i = 0; i < a ; i++) {
				String sentence = scanner.next();
				String answer = bracket(sentence);
				System.out.println(answer);
			}
			
			scanner.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	private static String bracket(String sentence) {
		Stack<Character> stack = new Stack<>();
		for (int j = 0; j < sentence.length(); j++) {
			if (sentence.charAt(j) == '(')
				stack.push('(');
			else if (stack.empty())
				return "NO";
			else
				stack.pop();
		}
		if (stack.empty())
			return "YES";
		else
			return "NO";
	}

}
