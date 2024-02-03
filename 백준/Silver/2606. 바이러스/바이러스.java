import java.io.*;
import java.util.*;

public class Main{
    // attribute
    public static int[][] arr;
    public static boolean[] visited;
    public static int answer;

    public static void main(String[] args) throws Exception{
        // 입력값
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        arr = new int[number+1][number+1];
        visited = new boolean[number + 1];
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n ; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // save - 양방향
            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        // 출력값
        dfs(1, number);
        System.out.println(answer);
    }

    public static void dfs(int number, int size){
        visited[number] = true;
        for (int i = 1 ; i < size + 1 ; i++){
            if(visited[i] || arr[number][i] == 0) continue;
            answer++;
            dfs(i, size);
        }
    }
}