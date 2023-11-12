
class Solution {
    boolean visited[];
    int answer = 0;
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        for (int i = 0; i < n ; i++){
            if(!visited[i]){
                dfs(i, n, computers);
                answer++;
            }
        }
        return answer;
    }
    
    private void dfs(int id, int n, int[][] computers){
        visited[id] = true;
        for (int i = 0 ; i < n ; i++){
            if (!visited[i] && computers[id][i] == 1 && id != i){
                dfs(i, n, computers);
            }
        }
    }
}