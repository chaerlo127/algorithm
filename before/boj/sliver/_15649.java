package boj.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _15649 {
    private static boolean[] visited;
    private static LinkedList<Integer> array;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            visited = new boolean[n + 1];
            array = new LinkedList<>();
            dfs(n, m);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void dfs(int n, int m) {
        if (array.size() == m) {
            System.out.println(array);
            return;
        }
        for (int i = 1; i < n + 1; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            array.push(i);
            dfs(n, m);
            visited[i] = false;
            array.pop();
        }
    }
}
