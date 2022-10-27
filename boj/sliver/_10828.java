package sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class _10828 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		try {
			int N = Integer.parseInt(br.readLine());
			for(int i = 0; i<N ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				switch (st.nextToken()) {
				case "push":{
					stack.add(Integer.parseInt(st.nextToken()));
					break;
				}case "pop":{
					if(stack.isEmpty()) sb.append(-1).append("\n");
					else sb.append(stack.pop()).append("\n");
					break;
				}case "size":{
					sb.append(stack.size()).append("\n");
					break;
				}case "empty":{
					if(stack.isEmpty()) sb.append(1).append("\n");
					else sb.append(0).append("\n");
					break;
				}case "top":{
					if(stack.isEmpty()) sb.append(-1).append("\n");
					else sb.append(stack.peek()).append("\n");
				}
				}
			}
			System.out.println(sb);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
