package boj.bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class _2338 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger x = scanner.nextBigInteger();
		BigInteger y = scanner.nextBigInteger();
		System.out.println(x.add(y));
		System.out.println(x.subtract(y));
		System.out.println(x.multiply(y));
		
		scanner.close();
	}

}
