package sliver;

import java.util.Scanner;
import java.util.Stack;

public class _10773 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Stack<Integer> a = new Stack<>();
		
		for(int i = 0 ; i < num ; i++) {
			int x = scanner.nextInt();
			if(x == 0) {
				if(a.size()>0) {
					a.pop();
				}
			}else {
				a.add(x);
			}
		}
		
		scanner.close();
		int sum = 0; 
		for(int i = 0 ; i<a.size() ; i++) {
			sum += a.get(i);
		}
		System.out.println(sum);
	}

}
