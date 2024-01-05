import java.io.*;
import java.util.*;
public class Main {
    static int n; // 정점
    static int m; // 간선
    static int v; // 탐색을 시작할 정점의 번호
    static int[][] arrays;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
        }

        arrays = new int[n + 1][n + 1];
        for (int i = 0; i < m ; i ++){
            String line = br.readLine();
            st = new StringTokenizer(line);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arrays[x][y] = 1;
            arrays[y][x] = 1;
        }

        visited = new boolean[n + 1];
        dfs(v);
        System.out.println();

        visited = new boolean[n + 1];
        bfs(v);
    }

    private static void dfs(int a) {
        visited[a] = true;
        System.out.print(a + " ");
        for (int i = 1; i < n + 1; i++){
            if(!visited[i] && arrays[a][i] == 1){
                dfs(i);
            }
        }
    }

    private static void bfs(int a) {
        Deque<Integer> queue = new LinkedList<>();
        queue.add(a);
        visited[a] = true;
        while(!queue.isEmpty()){
            int k = queue.remove();
            System.out.print(k + " ");
            for (int i = 1; i < n + 1; i ++){
                if(!visited[i] && arrays[k][i] == 1){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
