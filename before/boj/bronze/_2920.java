package boj.bronze;
import java.util.Scanner;

public class _2920 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] input = new int [8];
		for(int i = 0 ; i <8 ; i++) {
			input[i] = scanner.nextInt();
		}
		scanner.close();
		String output = "";
		for(int i = 0; i<8-1 ; i++) {
			if(input[i] == input[i+1]-1) {
				output = "ascending";
			}else if(input[i] == input[i+1]+1) {
				output = "descending";
			}else{
				output = "mixed";
				break;
			}
		}
		System.out.println(output);
		
	}

}
