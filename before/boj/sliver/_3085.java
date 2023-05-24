package boj.sliver;

import java.util.Scanner;

public class _3085 {
	protected static char[][] array;
	
	public static int checkRow(int x) {
		int max = 1, lastMax = 1; // max: ���� ������ max, lastMax: �� ���� max
		char ch = array[x][0];
		for(int i = 1; i < array.length; i++) {
			if(array[x][i] != ch) { // ���� �࿡ �ִ� �͵� �߿��� ���� ������ ������ �ƴ϶��
				ch = array[x][i]; // ���� ���� ����
				lastMax = Math.max(lastMax, max); // ���� max�� ��
				max = 1; 
			} else max++;
		}
		return Math.max(lastMax,  max);
	}
	
	public static int checkColumn(int y) {
		int max = 1, lastMax = 1;
		char ch = array[0][y];
		for(int i = 1; i < array.length; i++) {
			if(array[i][y] != ch) {
				ch = array[i][y];
				lastMax = Math.max(lastMax, max);
				max = 1;
			} else max++;
		}
		return Math.max(lastMax, max);
	}
	
	public static void swap(int x, int y, int x1, int y1) {
		char temp = array[x][y];
		array[x][y] = array[x1][y1];
		array[x1][y1] = temp;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		array = new char[n][n];
		int max = 0;
		
		for(int i = 0 ; i<n ; i++) {
			String x = scanner.next();
			for(int j = 0; j<x.length(); j++) {
				array[i][j] = x.charAt(j);
			}
			max = Math.max(max, checkRow(i)); // �̸� üũ
		}
		
		for(int i = 0; i<array.length; i++) {
			max = Math.max(max, checkColumn(i)); // �̸� üũ
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(i+1<array.length) { // i + 1 �� array.length ���� ũ�� �ȵ�.
					// ���� �Ʒ��ʰ� ��ġ ����
					swap(i, j, i+1, j);
					max = Math.max(max, checkRow(i));
					max = Math.max(max, checkRow(i+1));
					max = Math.max(max, checkColumn(j));
					swap(i, j, i+1, j);
				}
				if(j+1<array.length) { // j + 1�� array.length ���� ũ�� �ȵ�.
					// ���� �����ʰ� ��ġ ����
					swap(i, j, i, j+1);
					max = Math.max(max, checkRow(i));
					max = Math.max(max, checkColumn(j));
					max = Math.max(max, checkColumn(j+1));
					swap(i, j, i, j+1);
				}
			}
		}
		System.out.println(max);
		scanner.close();
	}

}
