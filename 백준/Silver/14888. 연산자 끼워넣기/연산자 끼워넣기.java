import java.io.*;
import java.util.*;

public class Main{
    public static boolean[] visited;
    public static int[] arr;

    public static int[] calArr;

    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        visited = new boolean[n];
        arr = new int[n];
        calArr = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 숫자
        for (int i = 0; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 사칙연산
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++){
            calArr[i] = Integer.parseInt(st.nextToken());
        }

        backTracking(arr[0], n, 1);

        System.out.println(max);
        System.out.println(min);
    }

    public static void backTracking(int answer, int n, int depth){
        if(n == depth){
            max = Math.max(max, answer);
            min = Math.min(min, answer);
            return;
        }

        for(int i = 0 ; i < 4 ; i++){
            if(calArr[i] == 0) continue;
            calArr[i]--;
            switch (i) {
                case 0: backTracking(answer + arr[depth], n, depth + 1); break;
                case 1: backTracking(answer - arr[depth], n, depth + 1); break;
                case 2: backTracking(answer * arr[depth], n, depth + 1); break;
                case 3: backTracking(answer / arr[depth], n, depth + 1); break;
            }
            calArr[i]++;
        }

    }
}