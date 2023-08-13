import java.util.Scanner;

public class Main {
	protected static char[][] array;
	
	public static int checkRow(int x) {
		int max = 1, lastMax = 1; // max: 기준 사탕의 max, lastMax: 한 행의 max
		char ch = array[x][0];
		for(int i = 1; i < array.length; i++) {
			if(array[x][i] != ch) { // 같은 행에 있는 것들 중에서 같은 색상의 사탕이 아니라면
				ch = array[x][i]; // 기준 사탕 변경
				lastMax = Math.max(lastMax, max); // 현재 max와 비교
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
			max = Math.max(max, checkRow(i)); // 미리 체크
		}
		
		for(int i = 0; i<array.length; i++) {
			max = Math.max(max, checkColumn(i)); // 미리 체크
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(i<array.length-1) {
					// 사탕 아래쪽과 위치 변경
					swap(i, j, i+1, j);
					max = Math.max(max, checkRow(i));
					max = Math.max(max, checkRow(i+1));
					max = Math.max(max, checkColumn(j));
					swap(i, j, i+1, j);
				}
				if(j<array.length-1) {
					// 사탕 오른쪽과 위치 변경
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
