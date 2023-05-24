package boj.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1002 {
// ������ ������ ���ϴ� ��
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		try {
			T = Integer.parseInt(br.readLine());
			for(int i = 0; i<T; i++) {
				String answer = br.readLine();
				StringTokenizer st = new StringTokenizer(answer, " ");
				
				int x1 = Integer.parseInt(st.nextToken());
				int y1 = Integer.parseInt(st.nextToken());
				int r1 = Integer.parseInt(st.nextToken());
				int x2 = Integer.parseInt(st.nextToken());
				int y2 = Integer.parseInt(st.nextToken());
				int r2 = Integer.parseInt(st.nextToken());
				
				int r = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)); // �� �� ������ �Ÿ��� ���� ���ϱ�

				// ���� ���� ��
					// x1 = x2, y1 = y2, r1 = r2�� ��
				if(x1 == x2 && y1 == y2 && r1 == r2) {
					System.out.println(-1);
				}
				// ���� 1��
					// ����: r1 + r2 = r�� ��� ���� 1��
				else if(r == Math.pow(r1+r2, 2)) {
					System.out.println(1);
				}
					// ����
				else if(r == Math.pow(r2-r1, 2)) {
					System.out.println(1);
				}
				// ������ ���� ��
					// ����: �� ���� �ٸ� ������ ������ ���� ���
				else if(r <Math.pow(r2-r1, 2)) {
					System.out.println(0);
				}
					// �ܺ�: �� ���� ���� ������ ���� ���
				else if(r> Math.pow(r1+r2, 2)) {
					System.out.println(0);
				}

				else { // ������ �ΰ��� ���
					System.out.println(2);
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
