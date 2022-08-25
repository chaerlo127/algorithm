package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2609 {
	public static int GCD(int a, int b) {
		if(b == 0) return a;
		return GCD(b, a%b);
		
	}
	public static int LCM(int a, int b, int gcd) {
		return (a*b)/gcd;
	}
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		try {
			st = new StringTokenizer(bf.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int gcd = GCD(a, b);
			int lcm = LCM(a, b, gcd);
			System.out.println(gcd);
			System.out.println(lcm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
