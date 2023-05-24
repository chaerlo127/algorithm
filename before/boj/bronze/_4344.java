package boj.bronze;
import java.util.Scanner;

public class _4344 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cases = scanner.nextInt();
		for(int i = 0; i < cases ; i++) {
			int N = scanner.nextInt();
			int[] score = new int[N];
			
			double sum = 0;
			for(int j = 0; j<N; j++) {
				score[j] = scanner.nextInt();
				sum +=score[j];
			}
			double avg = sum/N;
			double count = 0;
			
			for(int j = 0 ; j<N ; j++) {
				if(avg<score[j]) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
		
		scanner.close();
	}

}
