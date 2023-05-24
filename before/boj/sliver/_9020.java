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

// �Ҽ� ���ϱ�
	private static void primeNumber() {
		prime[0] = true;
		prime[1] = true; // 0�� 1�� �Ҽ��� �ƴ�

		 // ��Ʈ�� ���� length �� �����ٱ��� ���ʴ�� ����� ���� -> 2�� ���, 3�� ��� ���
		for(int i = 2; i<Math.sqrt(prime.length) ; i++) {
			if(prime[i]) continue; // �̹� ǥ�������� �Ѿ��
			for (int j = i * i; j < prime.length; j = j+i) { // ��� �ڵ� -> 2�� ��� 4, 8, 10 ... �̷��� �Ѿ
				prime[j] = true; // �Ҽ��� �ƴ� �͵��� true�� ����
			}
		}
	}

}
