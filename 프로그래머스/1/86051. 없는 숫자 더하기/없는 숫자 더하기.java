class Solution {
    public int solution(int[] numbers) {
        boolean[] visited = new boolean[10];
        for (int number : numbers){
            if(!visited[number]) visited[number] = true;
        }
        int answer = -1;
        
        for (int i = 0 ; i < 10; i ++){
            if(!visited[i]){
                answer += i;
            }
        }
        
        return answer + 1;
    }
}