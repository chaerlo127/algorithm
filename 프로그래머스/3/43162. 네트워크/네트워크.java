class Solution {
    public boolean[] visited;
    public int answer = 0;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        for (int i = 0; i <computers.length; i++){
            dfs(1, n, i, computers);
        }
        return n-answer;
    }
    
    public void dfs(int depth, int n, int k, int[][] computers){
        visited[k] = true;
        if(depth == n) return;
        for (int j = 0 ; j < computers[k].length ; j++){
            if(!visited[j] && computers[k][j] == 1){
                answer++;
                dfs(depth+1, n, j, computers);
            }
        }
        
    }
}