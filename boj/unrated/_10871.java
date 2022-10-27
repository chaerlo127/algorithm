package boj.unrated;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10871 {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			StringBuilder sb = new StringBuilder();
			st = new StringTokenizer(bf.readLine(), " ");
			for(int i = 0; i < n; i++) {
				int  a = Integer.parseInt(st.nextToken());
				if(a<x) {
					sb.append(a).append(" ");
				}
			}
			System.out.println(sb.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
