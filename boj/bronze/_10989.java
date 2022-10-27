package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class _10989 {

	public static void main(String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		try {
			int a = Integer.parseInt(buffer.readLine());
			int[] array = new int[a];
			for(int i = 0 ; i< a ; i++) {
				array[i] = Integer.parseInt(buffer.readLine());
			}
			buffer.close();
			
			Arrays.sort(array);
			
			for(int i = 0; i< a; i++) {
				sb.append(array[i]).append("\n");
			}
			System.out.println(sb);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
