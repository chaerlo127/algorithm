package boj.sliver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _2751 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		// String �� ���ڿ��� ���� �� ���ο� ��ü�� �����ϴ� ���� �ƴ�, ������ �����͸� ���ϴ� ���
		// �ӵ��� ������, ��������� ���ϰ� �����Ƿ� �� ���ڿ��� ���ϴ� ��Ȳ���� ���
		// StringBuffer: ���� �޼ҵ� ����ȭ ��Ƽ ������ ȯ�濡���� <���� ����ġ ���ϰ� ����Ǵ� ���� ����>
		// StringBuilder: �׿��� ����� StringBuilder�� �پ.
		ArrayList<Integer> a = new ArrayList<>();
		int num = scanner.nextInt();
		for(int i = 0; i<num; i++) {
			a.add(scanner.nextInt());
		}
		scanner.close();
		
		Collections.sort(a);
		//Arrays.sort(a)�� quicksort�̹Ƿ� �ð� ���⵵�� O(nlogn)������ worst case�� O(n^2)�� �� �� �ִ�.
		//Collections�� �ð� ���⵵�� �ִ� O(nlogn)�̴�.
		for(int i = 0; i<num; i++) {
			sb.append(a.get(i)).append("\n");
			// ���� ���ڿ��� �����ϸ� �߰� ���ڿ� ��ü�� �����Ǿ� ��ȿ������ �ڵ尡 ���� �����ȴ�.
			// String ��ü�� ������ �Ұ��� �� �Ͱ� �޸�, StringBuffer�� ������ �����ϴ�.
		}
		System.out.println(sb);
	}
}
