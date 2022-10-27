package unrated;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2475 {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			int sum = 0;
			while(st.hasMoreTokens()) {
				int a = Integer.parseInt(st.nextToken());
				sum += (a*a);
			}
			System.out.println(sum%10);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
