package boj.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _11651 {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		try {
			int a = Integer.parseInt(reader.readLine());
			int[][] xy = new int[a][2];
			
			for(int i = 0; i<a; i++) {
				StringTokenizer st = new StringTokenizer(reader.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				xy[i][1] = x;
				xy[i][0] = y;
				
			}
			Arrays.sort(xy, new Comparator<int []>(){
				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[0] == o2[0]) { // 첫 번째 원소들이 같다면
						return o1[1] - o2[1];
					}
					return o1[0] - o2[0];
				}
			});
			for(int i = 0; i<a; i++) {
				sb.append(xy[i][1]).append(" ").append(xy[i][0]).append("\n");
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
