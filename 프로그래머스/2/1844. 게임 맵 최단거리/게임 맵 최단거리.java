import java.util.*;

class Solution {
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};
    int[][] visited;
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
            int[] c = queue.poll();
            x = c[0];
            y = c[1];
            
            for (int i = 0 ; i < 4 ; i++){
                int cx = dx[i] + x;
                int cy = dy[i] + y;
                
                // 양옆이 막혀있거나, 밖으로 벗어난 경우
                if(cx < 0 || cy < 0 || cx > maps.length -1 || cy > maps[0].length -1){
                    continue;
                }
                
                // visited 되어 있지 않은 경우 + 가로막혀져잇지 않은 경우 
                if(visited[cx][cy] == 0 && maps[cx][cy] == 1){
                    visited[cx][cy] = visited[x][y] + 1;
                    queue.add(new int[]{cx, cy});
                }
            }
        }
    }
}