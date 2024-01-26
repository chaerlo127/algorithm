import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());

        int[] arrays = new int[n];
        for (int i = 0 ; i < n ; i++){
            arrays[i] = Integer.parseInt(input.readLine());
        }
        // sorting
        Arrays.sort(arrays);

        long answer = 0;
        for (int i = 0; i < n ; i++){
            answer += Math.abs(arrays[i] - (i + 1));
        }
        System.out.println(answer);
    }
}
