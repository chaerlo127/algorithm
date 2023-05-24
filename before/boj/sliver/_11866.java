package boj.sliver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _11866 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();
			
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		scanner.close();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 1; i<=n; i++) {
			queue.add(i);
		}
		
		stringBuilder.append("<");
		while(queue.size()>1) {
			for(int i = 1; i<k; i++) {
				int a = queue.poll();
				queue.add(a);
			}
			stringBuilder.append(queue.poll()).append(", ");
		}
		stringBuilder.append(queue.poll()).append(">");
		System.out.println(stringBuilder.toString());
	}

}
