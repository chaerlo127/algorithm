package bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class _1271Change {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger x = scanner.nextBigInteger();
		BigInteger y = scanner.nextBigInteger();
		scanner.close();
		System.out.println(x.divide(y));
		System.out.println(x.remainder(y));
	}
}
