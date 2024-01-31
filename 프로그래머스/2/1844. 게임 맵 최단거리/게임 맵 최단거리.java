import java.util.*;

class Solution {
    public int[] dx = {1, 0, -1, 0};
    public int[] dy = {0, 1, 0, -1};
    public int[][] visited;
    
    public int solution(int[][] maps) {
        visited = new int[maps.length][maps[0].length];
        bfs(maps);
        return visited[maps.length-1][maps[0].length-1] == 0 ? -1 : visited[maps.length-1][maps[0].length-1];
    }
    
    public void bfs(int[][] maps){
        Queue<int[]> queue = new LinkedList<>();
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        queue.add(new int[]{x, y});
        
        while(!queue.isEmpty()){
            int[] check = queue.remove();
            x = check[0];
            y = check[1];
            
            // 상하좌우 살펴보기
            for (int i = 0; i < 4 ; i++){
                int cx = x + dx[i];
                int cy = y + dy[i];
                // 밖을 벗어나거나 가로막혀져 있는 경우
                if(cx > maps.length - 1 || cx < 0 || cy > maps[0].length - 1 || cy < 0) continue;
                
                // 방문한 이력이 없고 가로막혀져 있지 않은 경우
                if(visited[cx][cy] == 0 && maps[cx][cy] == 1){
                    visited[cx][cy] = visited[x][y] + 1;
                    queue.add(new int[]{cx, cy});
                }
            }
        }
        
    }
}