import java.io.*;
import java.util.*;

public class Main{
    public static int[][] arrays;
    public static int white = 0;
    public static int blue = 0;

    public static void main(String[] args) throws Exception {
        // 입력 값
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        arrays = new int[n][n];
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n ; j++){
                arrays[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 출력 값
        partition(n, 0, 0);
        System.out.println(white);
        System.out.println(blue);
    }

    public static void partition(int n, int x, int y){
        // 값이 채워져 있는 경우
        if(checkColor(n, x, y)){
            if(arrays[x][y] == 0) white++;
            else blue++;
            return;
        }

        // 채워져 있지 않은 경우
        n = n / 2; // 값을 절반으로 나누기
        partition(n, x, y); // 4사분면
        partition(n, x + n, y); // 1사분면
        partition(n, x, y + n); // 2사분면
        partition(n, x + n, y + n); // 3사분면
    }

    public static boolean checkColor(int n, int x, int y){
        int check = arrays[x][y];
        for(int i = x ; i < n + x; i++){
            for (int j = y; j < n + y; j++){
                if(arrays[i][j] != check) return false;
            }
        }
        return true;
    }
}