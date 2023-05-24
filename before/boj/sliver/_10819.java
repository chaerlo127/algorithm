package boj.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 순열이 나올 수 있는 모든 경우의 수를 구하고 그 후에 절대 값으로 더해준다.
public class _10819 {
	static int[] array;
	static int[] array2;
	static boolean[] check;
	static int max;
	static int index;
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			index = Integer.parseInt(br.readLine());
			array = new int[index];
			array2 = new int[index];
			String a = br.readLine();
			StringTokenizer st = new StringTokenizer(a);
			int i = 0;
			while(st.hasMoreTokens()) {
				array[i++] = Integer.parseInt(st.nextToken());
			}
			
			check = new boolean[index];
			dfs(0);
			System.out.println(max);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void dfs(int count) {
		if(count == index) {
			int sum = 0;
			for(int i = 0; i<index-1; i++) {
				sum += Math.abs(array2[i] - array2[i+1]);
			}
			max = Math.max(sum, max);
		}else {
			// 순열로 나올 수 있는 모든 경우의 수
			// 세 개의 원소라면
			// 1 - 2 - 3, 1 - 3 - 2, 2 - 1- 3, 2 - 3 - 1, 3 - 1 - 2, 3 - 2 - 1
			for(int i = 0; i<index; i++) {
				if(check[i]) continue;
				check[i] = true;
				array2[count] = array[i];
				dfs(count+1);
				check[i] = false;
			}
		}
	}
	
}
