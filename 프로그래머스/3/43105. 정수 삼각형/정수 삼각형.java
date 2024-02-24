class Solution {
    public int solution(int[][] triangle) {
        for(int x = triangle.length-1; x > 0; x--){
            for(int y = 0; y < triangle[x].length-1; y++){
                triangle[x-1][y] += Math.max(triangle[x][y], triangle[x][y+1]);
            }
        }
        return triangle[0][0];
    }
}