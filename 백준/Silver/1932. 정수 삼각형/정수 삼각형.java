import java.io.*;
import java.util.*;

public class Main{
    public static int[][] arr;
    public static int[][] dp;
    public static int n;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        dp = new int[n][n];

        for(int i = 0; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int index = 0;
            while(st.hasMoreTokens()){
                arr[i][index++] = Integer.parseInt(st.nextToken());
            }
        }
        // bottom up 방식을 사용하기 때문에 마지막 줄에 있는 수를 복사
        for (int i = 0; i < n ; i++){
            dp[n-1][i] = arr[n-1][i];
        }

        System.out.println(recurPlus(0, 0));
    }


    public static int recurPlus(int col, int row){
        if(col == n - 1){
            return dp[col][row];
        }

        if(dp[col][row] == 0){
            dp[col][row] = Math.max(recurPlus(col + 1, row), recurPlus(col+1, row+1)) + arr[col][row];
        }

        return dp[col][row];
    }
}