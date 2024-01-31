import java.io.*;
import java.util.*;
public class Main{

    public static boolean[] visited;
    public static Stack<Integer> answer;
    public static StringBuilder sb;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        Integer n = Integer.parseInt(st.nextToken());
        Integer m = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        answer = new Stack<>();
        calculatePer(0, n, m);

        System.out.println(sb);
    }

    public static void calculatePer(int depth, int n, int m){
        if(m == depth) {
            for (Integer integer : answer) {
                sb.append(integer).append(' ');
            }
            sb.append('\n');
        }

        for(int i = 1; i <= n; i ++){
            if(visited[i]) continue;
            visited[i] = true;
            answer.add(i);
            calculatePer(depth+1, n, m);
            visited[i] = false;
            answer.pop();
        }
    }


}