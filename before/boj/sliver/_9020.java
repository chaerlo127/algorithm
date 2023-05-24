package boj.sliver;

import java.util.Scanner;

public class _9020 {
	
	private static boolean[] prime = new boolean[10000];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int  T = scanner.nextInt(); // test case
		
		primeNumber();
		
		for(int i = 0; i<T; i++) {
			int input = scanner.nextInt();
			
			int x = input/2;
			int y = input/2;
			while(prime[x] || prime[y]) {
				x--;
				y++;
			}
			System.out.println(x + " " + y);
		}
		scanner.close();
	}

// 소수 구하기
	private static void primeNumber() {
		prime[0] = true;
		prime[1] = true; // 0과 1은 소수가 아님

		 // 루트를 씌워 length 의 제곱근까지 차례대로 배수를 구함 -> 2의 배수, 3의 배수 등등
		for(int i = 2; i<Math.sqrt(prime.length) ; i++) {
			if(prime[i]) continue; // 이미 표시했으면 넘어가기
			for (int j = i * i; j < prime.length; j = j+i) { // 배수 코드 -> 2의 경우 4, 8, 10 ... 이렇게 넘어감
				prime[j] = true; // 소수가 아닌 것들을 true로 변경
			}
		}
	}

}
