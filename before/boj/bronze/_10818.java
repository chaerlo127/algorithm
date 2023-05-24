package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10818 {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			int a = Integer.parseInt(bf.readLine());
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int[] maxMin = new int[a];
			int index = 0;
			while(st.hasMoreTokens()) {
				maxMin[index] = Integer.parseInt(st.nextToken());
				index++;
			}
			Arrays.sort(maxMin);
			System.out.println(maxMin[0] + " " + maxMin[a-1]);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
