package boj.bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class _11382 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger a = scanner.nextBigInteger();
		BigInteger b = scanner.nextBigInteger();
		BigInteger c = scanner.nextBigInteger();
		System.out.println(a.add(b.add(c)));
	}

}
