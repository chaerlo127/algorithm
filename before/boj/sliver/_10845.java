package boj.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _10845 {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			int N = Integer.parseInt(bf.readLine());
			Queue<Integer> queue = new LinkedList<>();
			StringBuilder sb = new StringBuilder();
			int last = 0;
			for(int i = 0 ; i < N; i++) {
				StringTokenizer st = new StringTokenizer(bf.readLine());
				switch (st.nextToken()){
				case "push": {
					last = Integer.parseInt(st.nextToken());
					queue.add(last);
					break;
				}case "front" :{
					if(queue.isEmpty()) sb.append(-1).append("\n");
					else sb.append(queue.peek()).append("\n");
					break;
				}case "back" :{
					if(queue.isEmpty()) sb.append(-1).append("\n");
					else sb.append(last).append("\n");
					break;
				}case "empty" :{
					if(queue.isEmpty()) sb.append(1).append("\n");
					else sb.append(0).append("\n");
					break;
				}case "size" :{
					sb.append(queue.size()).append("\n");
					break;
				}case "pop":{
					if(queue.isEmpty()) sb.append(-1).append("\n");
					else sb.append(queue.poll()).append("\n");
					break;
				}
				}

			}
			System.out.println(sb);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
