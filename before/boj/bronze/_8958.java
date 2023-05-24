package boj.bronze;
import java.util.Scanner;

public class _8958 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int quizSize = scanner.nextInt();
		String[] quizArray = new String[quizSize];
		for(int i = 0 ; i < quizSize ; i++) {
			quizArray[i] = scanner.next();
		}
		scanner.close();
		
		for(int j = 0 ; j<quizArray.length; j++) {
			int count = 0;
			int sum = 0;
			for(int i = 0; i<quizArray[j].length(); i++) {
				if(quizArray[j].charAt(i)=='O') {
					count++;
				}else count = 0;
				sum +=count;
			}
			System.out.println(sum);
		}
	}

}
